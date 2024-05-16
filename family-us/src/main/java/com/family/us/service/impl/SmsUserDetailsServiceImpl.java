package com.family.us.service.impl;

import com.family.us.domain.UsLoginUser;
import com.family.us.domain.UsUser;
import com.family.us.service.UsUserService;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.exception.base.BaseException;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/5/12 13:25
 */
@Service
public class SmsUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsUserService userService;

    @Override
    public UserDetails loadUserByUsername(String tel) throws UsernameNotFoundException {
        UsUser user = userService.selectUsUserByTel(tel);
        if(StringUtils.isNull(user)){
            throw new UsernameNotFoundException("登录手机号：" + tel + " 不存在");
        }else if(user.getFlagDelete() == 1){
            throw new BaseException("对不起，您的账号：" + tel + " 已停用");
        }
        return createLoginUser(user);
    }

    public UserDetails createLoginUser(UsUser user){
        return new UsLoginUser(user,null);
    }
}