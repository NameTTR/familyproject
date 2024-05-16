package com.family.pl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 每天统计表
 * @TableName pl_statistics_date
 */
@TableName(value ="pl_statistics_date")
@Data
public class StatisticsDate implements Serializable {
    /**
     * 
     */
    @TableId(value = "ID")
    private Long ID;

    /**
     * 日期
     */
    @TableField(value = "task_date")
    private Date task_date;

    /**
     * 任务数
     */
    @TableField(value = "count_task")
    private Integer count_task;

    /**
     * 完成任务数
     */
    @TableField(value = "count_complete_task")
    private Integer count_complete_task;

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

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date update_time;

    /**
     * 删除标记
     */
    @TableField(value = "flag_delete")
    private Integer flag_delete;

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
        StatisticsDate other = (StatisticsDate) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getTask_date() == null ? other.getTask_date() == null : this.getTask_date().equals(other.getTask_date()))
            && (this.getCount_task() == null ? other.getCount_task() == null : this.getCount_task().equals(other.getCount_task()))
            && (this.getCount_complete_task() == null ? other.getCount_complete_task() == null : this.getCount_complete_task().equals(other.getCount_complete_task()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getFlag_delete() == null ? other.getFlag_delete() == null : this.getFlag_delete().equals(other.getFlag_delete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getTask_date() == null) ? 0 : getTask_date().hashCode());
        result = prime * result + ((getCount_task() == null) ? 0 : getCount_task().hashCode());
        result = prime * result + ((getCount_complete_task() == null) ? 0 : getCount_complete_task().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getCreated_time() == null) ? 0 : getCreated_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getFlag_delete() == null) ? 0 : getFlag_delete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", task_date=").append(task_date);
        sb.append(", count_task=").append(count_task);
        sb.append(", count_complete_task=").append(count_complete_task);
        sb.append(", user_id=").append(user_id);
        sb.append(", created_time=").append(created_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", flag_delete=").append(flag_delete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}