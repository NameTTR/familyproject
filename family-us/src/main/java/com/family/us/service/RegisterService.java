package com.family.us.service;

import com.family.us.domain.VO.UsUserRegister;
import com.ruoyi.common.core.domain.AjaxResult;

public interface RegisterService {
    AjaxResult register(UsUserRegister user);
}
