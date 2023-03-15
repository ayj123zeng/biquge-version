package com.jiuyun.biquge.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName n_history
 */
@TableName(value ="n_history")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class History implements Serializable {

    @TableField(exist = false)
    private Book book;
    /**
     * 
     */
    @TableId(value = "history_user_id")
    private Integer historyUserId;

    /**
     * 
     */
    @TableField(value = "history_book_id")
    private Integer historyBookId;

    /**
     * 
     */
    @TableField(value = "history_chapter_id")
    private Integer historyChapterId;

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
        History other = (History) that;
        return (this.getHistoryUserId() == null ? other.getHistoryUserId() == null : this.getHistoryUserId().equals(other.getHistoryUserId()))
            && (this.getHistoryBookId() == null ? other.getHistoryBookId() == null : this.getHistoryBookId().equals(other.getHistoryBookId()))
            && (this.getHistoryChapterId() == null ? other.getHistoryChapterId() == null : this.getHistoryChapterId().equals(other.getHistoryChapterId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHistoryUserId() == null) ? 0 : getHistoryUserId().hashCode());
        result = prime * result + ((getHistoryBookId() == null) ? 0 : getHistoryBookId().hashCode());
        result = prime * result + ((getHistoryChapterId() == null) ? 0 : getHistoryChapterId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", historyUserId=").append(historyUserId);
        sb.append(", historyBookId=").append(historyBookId);
        sb.append(", historyChapterId=").append(historyChapterId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}