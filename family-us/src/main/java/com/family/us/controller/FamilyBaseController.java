package com.family.us.controller;

import com.family.us.domain.UsLoginUser;
import com.family.us.domain.UsUser;
import com.family.us.utils.FamilySecurityUtils;
import com.ruoyi.common.core.controller.BaseController;

/**
 * 功能：获取当前用户缓存信息
 * 作者：Name
 * 日期：2024/5/13 15:01
 */
public class FamilyBaseController extends BaseController {

    public UsLoginUser getUsLoginUser() {
        return FamilySecurityUtils.getLoginUser();
    }

    public Long getUsUserId() {
        return getUsLoginUser().getUser().getID();
    }

    public String getUsUsername() {
        return getUsLoginUser().getUsername();
    }

    public UsUser getUsUser() {
        return getUsLoginUser().getUser();
    }
}