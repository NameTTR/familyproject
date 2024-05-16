package com.family.pl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 设置表
 * @TableName pl_setup
 */
@TableName(value ="pl_setup")
@Data
public class Setup implements Serializable {
    /**
     * 
     */
    @TableId(value = "ID")
    private Long ID;

    /**
     * 提醒重复：0：无；1：每天；2：每月；3：每年；4：工作日；5：法定工作日；6：艾宾浩斯记忆法
     */
    @TableField(value = "repeat")
    private Object repeat;

    /**
     * 已完成任务是否隐藏：0：不隐藏；1：隐藏
     */
    @TableField(value = "hide_complete")
    private Integer hide_complete;

    /**
     * 已选分组：1：按完成情况分组；2：按优先级分组
     */
    @TableField(value = "selected_groups")
    private Integer selected_groups;

    /**
     * 已选排序：1：按时间排序；2：按优先级排序
     */
    @TableField(value = "selected_order")
    private Integer selected_order;

    /**
     * 微信提醒：0：关闭；1：开启
     */
    @TableField(value = "remind_wechat")
    private Integer remind_wechat;

    /**
     * 本地日历提醒：0：关闭；1：开启
     */
    @TableField(value = "remind_calendar")
    private Integer remind_calendar;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Integer user_id;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private Date created_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Setup other = (Setup) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getRepeat() == null ? other.getRepeat() == null : this.getRepeat().equals(other.getRepeat()))
            && (this.getHide_complete() == null ? other.getHide_complete() == null : this.getHide_complete().equals(other.getHide_complete()))
            && (this.getSelected_groups() == null ? other.getSelected_groups() == null : this.getSelected_groups().equals(other.getSelected_groups()))
            && (this.getSelected_order() == null ? other.getSelected_order() == null : this.getSelected_order().equals(other.getSelected_order()))
            && (this.getRemind_wechat() == null ? other.getRemind_wechat() == null : this.getRemind_wechat().equals(other.getRemind_wechat()))
            && (this.getRemind_calendar() == null ? other.getRemind_calendar() == null : this.getRemind_calendar().equals(other.getRemind_calendar()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getRepeat() == null) ? 0 : getRepeat().hashCode());
        result = prime * result + ((getHide_complete() == null) ? 0 : getHide_complete().hashCode());
        result = prime * result + ((getSelected_groups() == null) ? 0 : getSelected_groups().hashCode());
        result = prime * result + ((getSelected_order() == null) ? 0 : getSelected_order().hashCode());
        result = prime * result + ((getRemind_wechat() == null) ? 0 : getRemind_wechat().hashCode());
        result = prime * result + ((getRemind_calendar() == null) ? 0 : getRemind_calendar().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getCreated_time() == null) ? 0 : getCreated_time().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", repeat=").append(repeat);
        sb.append(", hide_complete=").append(hide_complete);
        sb.append(", selected_groups=").append(selected_groups);
        sb.append(", selected_order=").append(selected_order);
        sb.append(", remind_wechat=").append(remind_wechat);
        sb.append(", remind_calendar=").append(remind_calendar);
        sb.append(", user_id=").append(user_id);
        sb.append(", created_time=").append(created_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}