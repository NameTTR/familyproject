package com.family.pl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务标签表
 * @TableName pl_task_label
 */
@TableName(value ="pl_task_label")
@Data
public class TaskLabel implements Serializable {
    /**
     * 
     */
    @TableId(value = "ID")
    private Long ID;

    /**
     * 任务ID
     */
    @TableField(value = "task_id")
    private Long task_id;

    /**
     * 标签ID
     */
    @TableField(value = "label_id")
    private Long label_id;

    /**
     * 标签表冗余字段，标签
     */
    @TableField(value = "label_name")
    private String label_name;

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
        TaskLabel other = (TaskLabel) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getTask_id() == null ? other.getTask_id() == null : this.getTask_id().equals(other.getTask_id()))
            && (this.getLabel_id() == null ? other.getLabel_id() == null : this.getLabel_id().equals(other.getLabel_id()))
            && (this.getLabel_name() == null ? other.getLabel_name() == null : this.getLabel_name().equals(other.getLabel_name()))
            && (this.getCreated_time() == null ? other.getCreated_time() == null : this.getCreated_time().equals(other.getCreated_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getTask_id() == null) ? 0 : getTask_id().hashCode());
        result = prime * result + ((getLabel_id() == null) ? 0 : getLabel_id().hashCode());
        result = prime * result + ((getLabel_name() == null) ? 0 : getLabel_name().hashCode());
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
        sb.append(", label_id=").append(label_id);
        sb.append(", label_name=").append(label_name);
        sb.append(", created_time=").append(created_time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}