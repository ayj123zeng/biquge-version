package com.jiuyun.biquge.mapper;

import com.jiuyun.biquge.bean.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Entity com.jiuyun.biquge.bean.Book
 */
public interface BookMapper extends BaseMapper<Book> {
    /**
     * 查询所有书，并且把书的类型得到
     * @return
     */
    List<Book> getAllAndClassName();

    List<Book> getAllBookByClassId(Integer classId);
}




