package com.family.pl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 每周统计表
 * @TableName pl_statistics_week
 */
@TableName(value ="pl_statistics_week")
@Data
public class StatisticsWeek implements Serializable {
    /**
     * 
     */
    @TableId(value = "ID")
    private Long ID;

    /**
     * 年份
     */
    @TableField(value = "task_year")
    private Integer task_year;

    /**
     * 第几周
     */
    @TableField(value = "task_week")
    private Integer task_week;

    /**
     * 开始日期
     */
    @TableField(value = "begin_date")
    private Date begin_date;

    /**
     * 结束日期
     */
    @TableField(value = "end_date")
    private Date end_date;

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
     * 准时完成的任务数
     */
    @TableField(value = "count_ontime_task")
    private Integer count_ontime_task;

    /**
     * 高优先级任务数
     */
    @TableField(value = "count_high_task")
    private Integer count_high_task;

    /**
     * 高优先级完成任务数
     */
    @TableField(value = "count_complete_high_task")
    private Integer count_complete_high_task;

    /**
     * 中优先级任务数
     */
    @TableField(value = "count_mid_task")
    private Integer count_mid_task;

    /**
     * 中优先级完成任务数
     */
    @TableField(value = "count_complete_mid_task")
    private Integer count_complete_mid_task;

    /**
     * 低优先级任务数
     */
    @TableField(value = "count_low_task")
    private Integer count_low_task;

    /**
     * 低优先级完成任务数
     */
    @TableField(value = "count_complete_low_task")
    private Integer count_complete_low_task;

    /**
     * 无优先级任务数
     */
    @TableField(value = "count_no_task")
    private Integer count_no_task;

    /**
     * 无优先级完成任务数
     */
    @TableField(value = "count_complete_no_task")
    private Integer count_complete_no_task;

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
        StatisticsWeek other = (StatisticsWeek) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getTask_year() == null ? other.getTask_year() == null : this.getTask_year().equals(other.getTask_year()))
            && (this.getTask_week() == null ? other.getTask_week() == null : this.getTask_week().equals(other.getTask_week()))
            && (this.getBegin_date() == null ? other.getBegin_date() == null : this.getBegin_date().equals(other.getBegin_date()))
            && (this.getEnd_date() == null ? other.getEnd_date() == null : this.getEnd_date().equals(other.getEnd_date()))
            && (this.getCount_task() == null ? other.getCount_task() == null : this.getCount_task().equals(other.getCount_task()))
            && (this.getCount_complete_task() == null ? other.getCount_complete_task() == null : this.getCount_complete_task().equals(other.getCount_complete_task()))
            && (this.getCount_ontime_task() == null ? other.getCount_ontime_task() == null : this.getCount_ontime_task().equals(other.getCount_ontime_task()))
            && (this.getCount_high_task() == null ? other.getCount_high_task() == null : this.getCount_high_task().equals(other.getCount_high_task()))
            && (this.getCount_complete_high_task() == null ? other.getCount_complete_high_task() == null : this.getCount_complete_high_task().equals(other.getCount_complete_high_task()))
            && (this.getCount_mid_task() == null ? other.getCount_mid_task() == null : this.getCount_mid_task().equals(other.getCount_mid_task()))
            && (this.getCount_complete_mid_task() == null ? other.getCount_complete_mid_task() == null : this.getCount_complete_mid_task().equals(other.getCount_complete_mid_task()))
            && (this.getCount_low_task() == null ? other.getCount_low_task() == null : this.getCount_low_task().equals(other.getCount_low_task()))
            && (this.getCount_complete_low_task() == null ? other.getCount_complete_low_task() == null : this.getCount_complete_low_task().equals(other.getCount_complete_low_task()))
            && (this.getCount_no_task() == null ? other.getCount_no_task() == null : this.getCount_no_task().equals(other.getCount_no_task()))
            && (this.getCount_complete_no_task() == null ? other.getCount_complete_no_task() == null : this.getCount_complete_no_task().equals(other.getCount_complete_no_task()))
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
        result = prime * result + ((getTask_year() == null) ? 0 : getTask_year().hashCode());
        result = prime * result + ((getTask_week() == null) ? 0 : getTask_week().hashCode());
        result = prime * result + ((getBegin_date() == null) ? 0 : getBegin_date().hashCode());
        result = prime * result + ((getEnd_date() == null) ? 0 : getEnd_date().hashCode());
        result = prime * result + ((getCount_task() == null) ? 0 : getCount_task().hashCode());
        result = prime * result + ((getCount_complete_task() == null) ? 0 : getCount_complete_task().hashCode());
        result = prime * result + ((getCount_ontime_task() == null) ? 0 : getCount_ontime_task().hashCode());
        result = prime * result + ((getCount_high_task() == null) ? 0 : getCount_high_task().hashCode());
        result = prime * result + ((getCount_complete_high_task() == null) ? 0 : getCount_complete_high_task().hashCode());
        result = prime * result + ((getCount_mid_task() == null) ? 0 : getCount_mid_task().hashCode());
        result = prime * result + ((getCount_complete_mid_task() == null) ? 0 : getCount_complete_mid_task().hashCode());
        result = prime * result + ((getCount_low_task() == null) ? 0 : getCount_low_task().hashCode());
        result = prime * result + ((getCount_complete_low_task() == null) ? 0 : getCount_complete_low_task().hashCode());
        result = prime * result + ((getCount_no_task() == null) ? 0 : getCount_no_task().hashCode());
        result = prime * result + ((getCount_complete_no_task() == null) ? 0 : getCount_complete_no_task().hashCode());
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
        sb.append(", task_year=").append(task_year);
        sb.append(", task_week=").append(task_week);
        sb.append(", begin_date=").append(begin_date);
        sb.append(", end_date=").append(end_date);
        sb.append(", count_task=").append(count_task);
        sb.append(", count_complete_task=").append(count_complete_task);
        sb.append(", count_ontime_task=").append(count_ontime_task);
        sb.append(", count_high_task=").append(count_high_task);
        sb.append(", count_complete_high_task=").append(count_complete_high_task);
        sb.append(", count_mid_task=").append(count_mid_task);
        sb.append(", count_complete_mid_task=").append(count_complete_mid_task);
        sb.append(", count_low_task=").append(count_low_task);
        sb.append(", count_complete_low_task=").append(count_complete_low_task);
        sb.append(", count_no_task=").append(count_no_task);
        sb.append(", count_complete_no_task=").append(count_complete_no_task);
        sb.append(", user_id=").append(user_id);
        sb.append(", created_time=").append(created_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", flag_delete=").append(flag_delete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}