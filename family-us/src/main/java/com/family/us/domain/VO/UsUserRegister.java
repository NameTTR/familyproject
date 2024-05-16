package com.family.us.domain.VO;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.family.us.domain.SmsLoginBody;
import com.family.us.domain.UsLoginUser;
import lombok.Data;

/**
 * 功能：注册实体类
 * 作者：Name
 * 日期：2024/5/13 9:09
 */
@Data
public class UsUserRegister extends SmsLoginBody {
    String password;
    String nickname;
    Integer sex;
    Integer role;
}