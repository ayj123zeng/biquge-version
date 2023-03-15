package com.jiuyun.biquge.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName n_collection
 */
@TableName(value ="n_collection")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Collection implements Serializable {
    @TableField(exist = false)
    private Book book;
    /**
     * 
     */
    @TableId(value = "collection_user_id")
    private Integer collectionUserId;

    /**
     * 
     */
    @TableField(value = "collection_status")
    private Integer collectionStatus;

    /**
     * 
     */
    @TableField(value = "collection_book_id")
    private Integer collectionBookId;

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
        Collection other = (Collection) that;
        return (this.getCollectionUserId() == null ? other.getCollectionUserId() == null : this.getCollectionUserId().equals(other.getCollectionUserId()))
            && (this.getCollectionStatus() == null ? other.getCollectionStatus() == null : this.getCollectionStatus().equals(other.getCollectionStatus()))
            && (this.getCollectionBookId() == null ? other.getCollectionBookId() == null : this.getCollectionBookId().equals(other.getCollectionBookId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCollectionUserId() == null) ? 0 : getCollectionUserId().hashCode());
        result = prime * result + ((getCollectionStatus() == null) ? 0 : getCollectionStatus().hashCode());
        result = prime * result + ((getCollectionBookId() == null) ? 0 : getCollectionBookId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", collectionUserId=").append(collectionUserId);
        sb.append(", collectionStatus=").append(collectionStatus);
        sb.append(", collectionBookId=").append(collectionBookId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}