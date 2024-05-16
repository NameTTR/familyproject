package com.family.us.domain;

/**
 * 用户手机号登录对象
 * 
 * @author ruoyi
 */
public class SmsLoginBody
{
    /**
     * 手机号
     */
    private String tel;

    /**
     * 验证码
     */
    private String code;

    /**
     * 唯一标识
     */
    private String uuid;

    public String getTel()
    {
        return tel;
    }

    public void setTel(String Tel)
    {
        this.tel = Tel;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }
}
