package com.jiuyun.biquge.service;

import com.jiuyun.biquge.bean.Book;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface BookService extends IService<Book> {
    List<Book> getAllAndClassName();
    List<Book> getAllBookByClassId(Integer classId);
}
