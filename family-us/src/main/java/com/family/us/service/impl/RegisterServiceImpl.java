package com.family.us.service.impl;

import com.family.common.exception.CustomException;
import com.family.us.domain.UsLoginUser;
import com.family.us.domain.UsUser;
import com.family.us.domain.VO.UsUserRegister;
import com.family.us.service.FamilyTokenService;
import com.family.us.service.RegisterService;
import com.family.us.service.UsUserService;
import com.family.us.smsConfig.SmsCodeAuthenticationToken;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.MessageUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/5/13 16:24
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private AuthenticationManager authenticationManager;

    @Autowired
    private FamilyTokenService tokenService;

    @Autowired
    private UsUserService userService;

    @Override
    public AjaxResult register(UsUserRegister registerBody) {

        UsUser nowUser = userService.selectUsUserByTel(registerBody.getTel());
        if(nowUser != null){
            return AjaxResult.error("用户已存在");
        }else {
        String account = registerBody.getTel(), password = registerBody.getPassword();
        Integer role = registerBody.getRole();
        UsUser user = new UsUser();
        user.setAccount(account);

        if (StringUtils.isEmpty(account)) {
            return AjaxResult.error("用户名不能为空");
        } else if (StringUtils.isEmpty(password)) {
            return AjaxResult.error("用户密码不能为空");
        } else if (password.length() < UserConstants.PASSWORD_MIN_LENGTH
                || password.length() > UserConstants.PASSWORD_MAX_LENGTH) {
            return AjaxResult.error("密码长度必须在5到20个字符之间");

        } else {
                if (role == 3 || role == 4) {
                    user.setTeenageMode(1);
                } else {
                    user.setTeenageMode(0);
                }
                user.setTel(registerBody.getTel());
                user.setRole(registerBody.getRole());
                user.setSex(registerBody.getSex());
                user.setNickname(registerBody.getNickname());
                user.setPassword(SecurityUtils.encryptPassword(password));
                boolean regFlag = userService.registerUser(user);
                if (!regFlag) {
                    return AjaxResult.error("注册失败");
                } else {
                    Authentication authentication = null;
                    try {
                        authentication = authenticationManager
                                .authenticate(new SmsCodeAuthenticationToken(account));
                    } catch (Exception e) {
                        throw new CustomException(e.getMessage());
                    }
                    UsLoginUser loginUser = (UsLoginUser) authentication.getPrincipal();
                    AjaxResult ajax = AjaxResult.success();

                    String token = tokenService.createToken(loginUser);
                    ajax.put(Constants.TOKEN, token);
                    return ajax;
                }
            }
        }
    }
}