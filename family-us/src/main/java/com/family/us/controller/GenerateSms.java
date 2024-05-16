package com.family.us.controller;

import com.family.us.constant.SmsConstants;
import com.family.us.domain.SmsLoginBody;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.redis.RedisCache;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 功能：生成验证码
 * 作者：Name
 * 日期：2024/5/11 14:51
 */
@Anonymous
@RestController
public class GenerateSms {
    @Autowired
    private RedisCache redisCache;

    @PostMapping("/sms/code")
    @ResponseBody
    public AjaxResult sms(@RequestBody SmsLoginBody loginBody){
        String tel = loginBody.getTel();
        String uuid = IdUtils.simpleUUID();
        String verifyKey = SmsConstants.SMS_CAPTCHA_CODE_KEY + uuid;
        int code = (int)Math.ceil(Math.random() * 9000 + 1000);
        code = 9999;
        Map<String, Object> map = new HashMap<>(16);
        map.put("tel", tel);
        map.put("code", code);
        System.out.println(code);
        redisCache.setCacheObject(verifyKey, map, SmsConstants.SMS_EXPIRATION, TimeUnit.MINUTES);
        AjaxResult ajax = AjaxResult.success();
        ajax.put("uuid", uuid);
        return ajax;
    }
}