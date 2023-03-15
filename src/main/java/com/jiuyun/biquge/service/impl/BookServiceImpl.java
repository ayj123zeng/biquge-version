package com.jiuyun.biquge.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiuyun.biquge.bean.Book;
import com.jiuyun.biquge.service.BookService;
import com.jiuyun.biquge.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{
    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> getAllAndClassName() {
        return bookMapper.getAllAndClassName();
    }

    public List<Book> getAllBookByClassId(Integer classId){
        return bookMapper.getAllBookByClassId(classId);
    }
}




