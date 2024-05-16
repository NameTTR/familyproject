package com.family.us.constant;

import com.ruoyi.common.constant.Constants;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/5/11 15:00
 */
public class SmsConstants extends Constants {
    /**
     * 短信验证码 redis key
     */
    public static final String SMS_CAPTCHA_CODE_KEY = "sms_captcha_codes:";


    /**
     * 短信验证码有效期（分钟）
     */
    public static final Integer SMS_EXPIRATION = 3;
}