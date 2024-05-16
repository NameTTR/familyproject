package com.family.us.service.impl;

import com.family.us.domain.UsUser;
import com.family.us.mapper.UsUserMapper;
import com.family.us.service.UsUserService;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 用户Service业务层处理
 * 
 * @author 高俊炜
 * @date 2024-04-17
 */
@Service
public class UsUserServiceImpl implements UsUserService
{
    @Autowired
    private UsUserMapper usUserMapper;

    /**
     * 查询用户
     * 
     * @param ID 用户主键
     * @return 用户
     */
    @Override
    public UsUser selectUsUserByID(Long ID)
    {
        return usUserMapper.selectUsUserByID(ID);
    }

    @Override
    public UsUser selectUsUserByAccount(String account) {
        return usUserMapper.selectUsUserByAccount(account);
    }

    @Override
    public UsUser selectUsUserByTel(String tel) {
        return usUserMapper.selectUsUserByTel(tel);
    }

    @Override
    public boolean registerUser(UsUser user) {
        return usUserMapper.insertUsUser(user);
    }

    /**
     * 修改用户
     * 
     * @param usUser 用户
     * @return 结果
     */
    @Override
    public int updateUsUser(UsUser usUser)
    {
        usUser.setUpdateTime(DateUtils.getNowDate());
        usUser.setUpdateUserId(usUser.getID());
        return usUserMapper.updateUsUser(usUser);
    }

    /**
     * 检查手机号是否唯一
     *
     * @param usUser 需要用户
     * @return 结果
     */
    @Override
    public boolean checkTelUnique(UsUser usUser) {
        Long userId = StringUtils.isNull(usUser.getID()) ? -1L : usUser.getID();
        UsUser info = usUserMapper.checkTelUnique(usUser.getTel());
        if (StringUtils.isNotNull(info) && info.getID().longValue() != userId.longValue())
        {
            return UserConstants.NOT_UNIQUE;
        }
        return UserConstants.UNIQUE;
    }

    /**
     * 重置密码
     *
     * @param ID,newPassword 需要用户主键和新密码
     * @return 结果
     */
    @Override
    public int resetUserPwd(Long ID, String newPassword) {
        return usUserMapper.resetUserPwd(ID, newPassword);
    }

    /**
     * 更换头像
     *
     * @param ID,avatar 需要用户主键和图片路径
     * @return 结果
     */
    @Override
    public boolean updateUserAvatar(Long ID, String avatar) {
        return usUserMapper.updateUserAvatar(ID, avatar) > 0;
    }

    /**
     * 更换背景图
     *
     * @param ID,background 需要用户主键和图片路径
     * @return 结果
     */
    @Override
    public boolean updateUserBackground(Long ID, String background) {
        return usUserMapper.updateUserBackground(ID, background) > 0;
    }
}
