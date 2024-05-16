package com.family.us.controller;

import com.family.us.domain.SmsLoginBody;
import com.family.us.service.SmsLoginService;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：手机号登录
 * 作者：gaojunwei
 * 日期：2024/5/11 15:09
 */
@Anonymous
@RestController
@RequestMapping("/sms")
public class SmsLoginController {
    @Autowired
    private SmsLoginService smsLoginService;

    @PostMapping("/login")
    public AjaxResult smsLogin(@RequestBody SmsLoginBody loginBody){
        String tel = loginBody.getTel();
        String smsCode = loginBody.getCode();
        String uuid = loginBody.getUuid();
        AjaxResult ajax = smsLoginService.smsLogin(tel, smsCode, uuid);
        return ajax;
    }
}