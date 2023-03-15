package com.jiuyun.biquge.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName n_chapter
 */
@TableName(value ="n_chapter")
@Data
public class Chapter implements Serializable {
    @TableField(exist = false)
    private Book book;
    /**
     * 
     */
    @TableId(value = "chapter_Id", type = IdType.AUTO)
    private Integer chapterId;

    /**
     * 
     */
    @TableField(value = "chapter_Number")
    private Integer chapterNumber;

    /**
     * 
     */
    @TableField(value = "chapter_Name")
    private String chapterName;

    /**
     * 
     */
    @TableField(value = "chapter_Content")
    private String chapterContent;

    /**
     * 
     */
    @TableField(value = "chapter_Book_Id")
    private Integer chapterBookId;

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
        Chapter other = (Chapter) that;
        return (this.getChapterId() == null ? other.getChapterId() == null : this.getChapterId().equals(other.getChapterId()))
            && (this.getChapterNumber() == null ? other.getChapterNumber() == null : this.getChapterNumber().equals(other.getChapterNumber()))
            && (this.getChapterName() == null ? other.getChapterName() == null : this.getChapterName().equals(other.getChapterName()))
            && (this.getChapterContent() == null ? other.getChapterContent() == null : this.getChapterContent().equals(other.getChapterContent()))
            && (this.getChapterBookId() == null ? other.getChapterBookId() == null : this.getChapterBookId().equals(other.getChapterBookId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getChapterId() == null) ? 0 : getChapterId().hashCode());
        result = prime * result + ((getChapterNumber() == null) ? 0 : getChapterNumber().hashCode());
        result = prime * result + ((getChapterName() == null) ? 0 : getChapterName().hashCode());
        result = prime * result + ((getChapterContent() == null) ? 0 : getChapterContent().hashCode());
        result = prime * result + ((getChapterBookId() == null) ? 0 : getChapterBookId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chapterId=").append(chapterId);
        sb.append(", chapterNumber=").append(chapterNumber);
        sb.append(", chapterName=").append(chapterName);
        sb.append(", chapterContent=").append(chapterContent);
        sb.append(", chapterBookId=").append(chapterBookId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}