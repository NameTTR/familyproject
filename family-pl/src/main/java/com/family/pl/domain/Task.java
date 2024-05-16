package com.family.pl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务表
 * @TableName pl_task
 */
@TableName(value ="pl_task")
@Data
public class Task implements Serializable {
    /**
     * 
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long ID;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 备注，包括任务说明和完成任务的备注
     */
    @TableField(value = "notes")
    private String notes;

    /**
     * 日期
     */
    @TableField(value = "task_date")
    private Date task_date;

    /**
     * 开始时间，允许为空，空值则表示全天
     */
    @TableField(value = "task_time_begin")
    private Date task_time_begin;

    /**
     * 结束时间，允许为空，若开始时间为空，则结束时间不允许非空
     */
    @TableField(value = "task_time_end")
    private Date task_time_end;

    /**
     * 重复：0：无；1：每天；2：每月；3：每年；4：工作日；5：法定工作日；6：艾宾浩斯记忆法
     */
    @TableField(value = "`repeat`")
    private Integer repeat;

    /**
     * 重复结束时间
     */
    @TableField(value = "repeat_end")
    private Date repeat_end;

    /**
     * 优先级：0：无；1；低；2：中；3：高
     */
    @TableField(value = "priority")
    private Integer priority;

    /**
     * 是否完成：0：否；1：是（针对已完成任务）
     */
    @TableField(value = "is_complete")
    private Integer is_complete;

    /**
     * 是否全部结束：0：否；1：是
     */
    @TableField(value = "is_end")
    private Integer is_end;

    /**
     * 是否有标签：0：否；1：是
     */
    @TableField(value = "is_label")
    private Integer is_label;

    /**
     * 是否设置提醒：0：否；1：是
     */
    @TableField(value = "is_remind")
    private Integer is_remind;

    /**
     * 是否有子任务：0：否；1：是
     */
    @TableField(value = "is_have_child")
    private Integer is_have_child;

    /**
     * 是否超时完成：0：否；1：是；结束时间之前不算超时
     */
    @TableField(value = "is_timeout")
    private Integer is_timeout;

    /**
     * 父任务ID，空值则表示一级任务，非空表示是某个任务的子任务
     */
    @TableField(value = "father_task_id")
    private Long father_task_id;

    /**
     * 完成关联任务ID（已完成的任务才需要设置关联任务ID）
     */
    @TableField(value = "related_task_id")
    private Long related_task_id;

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
        Task other = (Task) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
            && (this.getTask_date() == null ? other.getTask_date() == null : this.getTask_date().equals(other.getTask_date()))
            && (this.getTask_time_begin() == null ? other.getTask_time_begin() == null : this.getTask_time_begin().equals(other.getTask_time_begin()))
            && (this.getTask_time_end() == null ? other.getTask_time_end() == null : this.getTask_time_end().equals(other.getTask_time_end()))
            && (this.getRepeat() == null ? other.getRepeat() == null : this.getRepeat().equals(other.getRepeat()))
            && (this.getRepeat_end() == null ? other.getRepeat_end() == null : this.getRepeat_end().equals(other.getRepeat_end()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getIs_complete() == null ? other.getIs_complete() == null : this.getIs_complete().equals(other.getIs_complete()))
            && (this.getIs_end() == null ? other.getIs_end() == null : this.getIs_end().equals(other.getIs_end()))
            && (this.getIs_label() == null ? other.getIs_label() == null : this.getIs_label().equals(other.getIs_label()))
            && (this.getIs_remind() == null ? other.getIs_remind() == null : this.getIs_remind().equals(other.getIs_remind()))
            && (this.getIs_have_child() == null ? other.getIs_have_child() == null : this.getIs_have_child().equals(other.getIs_have_child()))
            && (this.getIs_timeout() == null ? other.getIs_timeout() == null : this.getIs_timeout().equals(other.getIs_timeout()))
            && (this.getFather_task_id() == null ? other.getFather_task_id() == null : this.getFather_task_id().equals(other.getFather_task_id()))
            && (this.getRelated_task_id() == null ? other.getRelated_task_id() == null : this.getRelated_task_id().equals(other.getRelated_task_id()))
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
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getTask_date() == null) ? 0 : getTask_date().hashCode());
        result = prime * result + ((getTask_time_begin() == null) ? 0 : getTask_time_begin().hashCode());
        result = prime * result + ((getTask_time_end() == null) ? 0 : getTask_time_end().hashCode());
        result = prime * result + ((getRepeat() == null) ? 0 : getRepeat().hashCode());
        result = prime * result + ((getRepeat_end() == null) ? 0 : getRepeat_end().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getIs_complete() == null) ? 0 : getIs_complete().hashCode());
        result = prime * result + ((getIs_end() == null) ? 0 : getIs_end().hashCode());
        result = prime * result + ((getIs_label() == null) ? 0 : getIs_label().hashCode());
        result = prime * result + ((getIs_remind() == null) ? 0 : getIs_remind().hashCode());
        result = prime * result + ((getIs_have_child() == null) ? 0 : getIs_have_child().hashCode());
        result = prime * result + ((getIs_timeout() == null) ? 0 : getIs_timeout().hashCode());
        result = prime * result + ((getFather_task_id() == null) ? 0 : getFather_task_id().hashCode());
        result = prime * result + ((getRelated_task_id() == null) ? 0 : getRelated_task_id().hashCode());
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
        sb.append(", title=").append(title);
        sb.append(", notes=").append(notes);
        sb.append(", task_date=").append(task_date);
        sb.append(", task_time_begin=").append(task_time_begin);
        sb.append(", task_time_end=").append(task_time_end);
        sb.append(", repeat=").append(repeat);
        sb.append(", repeat_end=").append(repeat_end);
        sb.append(", priority=").append(priority);
        sb.append(", is_complete=").append(is_complete);
        sb.append(", is_end=").append(is_end);
        sb.append(", is_label=").append(is_label);
        sb.append(", is_remind=").append(is_remind);
        sb.append(", is_have_child=").append(is_have_child);
        sb.append(", is_timeout=").append(is_timeout);
        sb.append(", father_task_id=").append(father_task_id);
        sb.append(", related_task_id=").append(related_task_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", created_time=").append(created_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", flag_delete=").append(flag_delete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}