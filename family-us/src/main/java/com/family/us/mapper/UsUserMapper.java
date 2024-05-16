package com.family.us.mapper;

import com.family.us.domain.UsUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户Mapper接口
 * 
 * @author 高俊炜
 * @date 2024-04-17
 */
public interface UsUserMapper 
{
    /**
     * 查询用户
     * 
     * @param ID 用户主键
     * @return 用户
     */
    public UsUser selectUsUserByID(@RequestParam("ID") Long ID);

    /**
     * 修改用户
     * 
     * @param usUser 用户
     * @return 结果
     */
    public int updateUsUser(UsUser usUser);

    /**
     * 检查手机号是否唯一
     *
     * @param tel 需要用户手机号
     * @return 结果
     */
    public UsUser checkTelUnique(String tel);

    /**
     * 重置密码
     *
     * @param ID,newPassword 需要用户主键和新密码
     * @return 结果
     */
    public int resetUserPwd(@Param("ID") Long ID, @Param("newPassword") String newPassword);

    /**
     * 更换图片
     *
     * @param ID,avatar 需要用户主键和图片路径
     * @return 结果
     */
    public int updateUserAvatar(@Param("ID") Long ID, @Param("avatar") String avatar);

    /**
     * 更换背景图
     *
     * @param ID,background 需要用户主键和图片路径
     * @return 结果
     */
    public int updateUserBackground(@Param("ID") Long ID, @Param("background") String background);

    public UsUser selectUsUserByAccount(@Param("account") String account);

    public UsUser selectUsUserByTel(@Param("tel") String tel);

    public boolean insertUsUser(UsUser user);
}
