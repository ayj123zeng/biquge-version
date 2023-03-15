package com.jiuyun.biquge.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName n_star
 */
@TableName(value ="n_star")
@Data
public class Star implements Serializable {
    /**
     * 
     */
    @TableId(value = "star_Id", type = IdType.AUTO)
    private Integer starId;

    /**
     * 
     */
    @TableField(value = "star_User_Id")
    private Integer starUserId;

    /**
     * 
     */
    @TableField(value = "star_Book_Id")
    private Integer starBookId;

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
        Star other = (Star) that;
        return (this.getStarId() == null ? other.getStarId() == null : this.getStarId().equals(other.getStarId()))
            && (this.getStarUserId() == null ? other.getStarUserId() == null : this.getStarUserId().equals(other.getStarUserId()))
            && (this.getStarBookId() == null ? other.getStarBookId() == null : this.getStarBookId().equals(other.getStarBookId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStarId() == null) ? 0 : getStarId().hashCode());
        result = prime * result + ((getStarUserId() == null) ? 0 : getStarUserId().hashCode());
        result = prime * result + ((getStarBookId() == null) ? 0 : getStarBookId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", starId=").append(starId);
        sb.append(", starUserId=").append(starUserId);
        sb.append(", starBookId=").append(starBookId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}