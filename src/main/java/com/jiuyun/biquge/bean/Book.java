package com.jiuyun.biquge.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName n_book
 */
@TableName(value ="n_book")
@Data
public class Book implements Serializable {
    @TableField(exist = false)
    private String className;
    /**
     * 
     */
    @TableId(value = "book_Id", type = IdType.AUTO)
    private Integer bookId;

    /**
     * 
     */
    @TableField(value = "book_Name")
    private String bookName;

    /**
     * 
     */
    @TableField(value = "book_Intro")
    private String bookIntro;

    /**
     * 
     */
    @TableField(value = "book_Author")
    private String bookAuthor;

    /**
     * 
     */
    @TableField(value = "book_Class_Id")
    private Integer bookClassId;

    /**
     * 
     */
    @TableField(value = "book_image")
    private String bookImage;

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
        Book other = (Book) that;
        return (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
            && (this.getBookIntro() == null ? other.getBookIntro() == null : this.getBookIntro().equals(other.getBookIntro()))
            && (this.getBookAuthor() == null ? other.getBookAuthor() == null : this.getBookAuthor().equals(other.getBookAuthor()))
            && (this.getBookClassId() == null ? other.getBookClassId() == null : this.getBookClassId().equals(other.getBookClassId()))
            && (this.getBookImage() == null ? other.getBookImage() == null : this.getBookImage().equals(other.getBookImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getBookIntro() == null) ? 0 : getBookIntro().hashCode());
        result = prime * result + ((getBookAuthor() == null) ? 0 : getBookAuthor().hashCode());
        result = prime * result + ((getBookClassId() == null) ? 0 : getBookClassId().hashCode());
        result = prime * result + ((getBookImage() == null) ? 0 : getBookImage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookId=").append(bookId);
        sb.append(", bookName=").append(bookName);
        sb.append(", bookIntro=").append(bookIntro);
        sb.append(", bookAuthor=").append(bookAuthor);
        sb.append(", bookClassId=").append(bookClassId);
        sb.append(", bookImage=").append(bookImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}