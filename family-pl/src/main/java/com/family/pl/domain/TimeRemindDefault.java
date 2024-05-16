package com.family.pl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 提醒默认表
 * @TableName pl_time_remind_default
 */
@TableName(value ="pl_time_remind_default")
@Data
public class TimeRemindDefault implements Serializable {
    /**
     * 
     */
    @TableId(value = "ID")
    private Long ID;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Integer user_id;

    /**
     * 类别：1：按（开始）时间提醒；2：按天提醒

     */
    @TableField(value = "type")
    private Object type;

    /**
     * 按时间提前提醒：0：无；1：准时；2：提前5分钟；3：提前30分钟；4：提前1天
     */
    @TableField(value = "remind_time")
    private Object remind_time;

    /**
     * 按天提前提醒：0：无；1：当天；2：提前1天；3：提前2天；4：提前3天
     */
    @TableField(value = "remind_date")
    private Object remind_date;

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
        TimeRemindDefault other = (TimeRemindDefault) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRemind_time() == null ? other.getRemind_time() == null : this.getRemind_time().equals(other.getRemind_time()))
            && (this.getRemind_date() == null ? other.getRemind_date() == null : this.getRemind_date().equals(other.getRemind_date()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRemind_time() == null) ? 0 : getRemind_time().hashCode());
        result = prime * result + ((getRemind_date() == null) ? 0 : getRemind_date().hashCode());
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
        sb.append(", user_id=").append(user_id);
        sb.append(", type=").append(type);
        sb.append(", remind_time=").append(remind_time);
        sb.append(", remind_date=").append(remind_date);
        sb.append(", created_time=").append(created_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}