package com.family.us.service.impl;

import com.family.us.constant.SmsConstants;
import com.family.us.domain.UsLoginUser;
import com.family.us.domain.VO.UsUserRegister;
import com.family.us.service.FamilyTokenService;
import com.family.us.service.SmsLoginService;
import com.family.us.smsConfig.SmsCodeAuthenticationToken;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.redis.RedisCache;
import com.family.common.exception.CustomException;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/5/11 15:13
 */
@Service
public class SmsLoginServiceImpl implements SmsLoginService {

    @Autowired
    private FamilyTokenService tokenService;

    @Resource
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    @Override
    public AjaxResult smsLogin(String tel, String smsCode, String uuid) {
        Authentication authentication = null;
        try{
            checkSmsCode(tel, smsCode, uuid);
            authentication = authenticationManager
                    .authenticate(new SmsCodeAuthenticationToken(tel));
        } catch (Exception e){
            throw new CustomException(e.getMessage());
        }
        UsLoginUser loginUser = (UsLoginUser) authentication.getPrincipal();
        AjaxResult ajax = AjaxResult.success();

        String token = tokenService.createToken(loginUser);
        ajax.put(Constants.TOKEN, token);
        return ajax;
    }

    private void checkSmsCode(String tel, String inputCode, String uuid){
        String verifyKey = SmsConstants.SMS_CAPTCHA_CODE_KEY + uuid;
        Map<String, Object> smsCode =  redisCache.getCacheObject(verifyKey);
        redisCache.deleteObject(verifyKey);
        if(StringUtils.isEmpty(inputCode)){
            throw new BadCredentialsException("验证码不能为空");
        }
        if(smsCode == null){
            throw new BadCredentialsException("验证码失效");
        }
        String applyTel = (String) smsCode.get("tel");
        int code = (int) smsCode.get("code");
        if(!applyTel.equals(tel)){
            throw new BadCredentialsException("手机号码不一致");
        }
        if(code != Integer.parseInt(inputCode)){
            throw new BadCredentialsException("验证码错误");
        }
    }
}