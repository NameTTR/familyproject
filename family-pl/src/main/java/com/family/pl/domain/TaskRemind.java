package com.family.pl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务提醒表
 * @TableName pl_task_remind
 */
@TableName(value ="pl_task_remind")
@Data
public class TaskRemind implements Serializable {
    /**
     * 
     */
    @TableId(value = "ID")
    private Long ID;

    /**
     * 任务表ID
     */
    @TableField(value = "task_id")
    private Long task_id;

    /**
     * 类别：1：按（开始）时间提醒；2：按天提醒

     */
    @TableField(value = "type")
    private Object type;

    /**
     * 按时间提前提醒：0：无；1：准时；2：提前5分钟；3：提前30分钟；4：提前1天
     */
    @TableField(value = "remind_by_time")
    private Object remind_by_time;

    /**
     * 按天提前提醒：0：无；1：当天；2：提前1天；3：提前2天；4：提前3天
     */
    @TableField(value = "remind_by_date")
    private Object remind_by_date;

    /**
     * corn字符串
     */
    @TableField(value = "corn")
    private String corn;

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
        TaskRemind other = (TaskRemind) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRemind_by_time() == null ? other.getRemind_by_time() == null : this.getRemind_by_time().equals(other.getRemind_by_time()))
            && (this.getRemind_by_date() == null ? other.getRemind_by_date() == null : this.getRemind_by_date().equals(other.getRemind_by_date()))
            && (this.getCorn() == null ? other.getCorn() == null : this.getCorn().equals(other.getCorn()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRemind_by_time() == null) ? 0 : getRemind_by_time().hashCode());
        result = prime * result + ((getRemind_by_date() == null) ? 0 : getRemind_by_date().hashCode());
        result = prime * result + ((getCorn() == null) ? 0 : getCorn().hashCode());
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
        sb.append(", task_id=").append(task_id);
        sb.append(", type=").append(type);
        sb.append(", remind_by_time=").append(remind_by_time);
        sb.append(", remind_by_date=").append(remind_by_date);
        sb.append(", corn=").append(corn);
        sb.append(", created_time=").append(created_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}