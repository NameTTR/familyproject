package com.family.us.controller;

import com.family.us.domain.VO.UsUserRegister;
import com.family.us.service.RegisterService;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static com.ruoyi.common.core.domain.AjaxResult.error;
import static com.ruoyi.common.core.domain.AjaxResult.success;

/**
 * 功能：注册接口
 * 作者：Name
 * 日期：2024/5/13 16:17
 */
@Anonymous
@RestController
@RequestMapping
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/us/register")
    public AjaxResult register(@RequestBody UsUserRegister user){
        AjaxResult ajax = registerService.register(user);
        return ajax;
    }
}