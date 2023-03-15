package com.jiuyun.biquge.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jiuyun.biquge.bean.Book;
import com.jiuyun.biquge.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: abb
 * @DateTime: 2023-03-11 16:05
 * @Description: TODO
 **/
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/getAll")
    public Map<String,Object> getAll(){
        Map<String,Object> map =new HashMap<>();
        List<Book> bookList = bookService.getAllAndClassName();
        if (bookList.isEmpty()){
            map.put("code",0);
        }
        map.put("bookList",bookList);
        map.put("code",1);
        return map;
    }

    /**
     * 得到对应类型的书籍的总数
     * @param classId
     * @return
     */
    @GetMapping("/getCountByClassId")
    public Long getCountByClassId(Integer classId){
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("book_class_id",classId);
        return bookService.count(queryWrapper);
    }

    /**
     * 根据bookId查询对应书籍
     * @param bookId
     * @return
     */
    @PostMapping("/getBookByBookId")
    public Map<String, Object> getBookByBookId(Integer bookId){
        Map<String, Object> map = new HashMap<>();
        Book book = bookService.getById(bookId);
        if (book!=null){
            map.put("code",0);
        }
        map.put("book",book);
        map.put("code",1);
        return map;
    }

    @PostMapping("/getAllBookByClassId")
    public Map<String , Object> getAllBookByClassId(Integer classId){
        Map<String,Object> map=new HashMap<>();
        List<Book> bookList = bookService.getAllBookByClassId(classId);
        if (bookList.isEmpty()){
            map.put("code",0);
        }
        map.put("bookList",bookList);
        map.put("code",1);
        return map;
    }

    @PostMapping("/getBookListByBookNameOrBookAuthor")
    public Map<String,Object> getBookListByBookNameOrBookAuthor(String condition){
        Map<String,Object> map=new HashMap<>();
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.like("book_name","%"+condition+"%")
                .or().like("book_author","%"+condition+"%");
        List<Book> bookList = bookService.list(wrapper);
        if (bookList.isEmpty()){
            map.put("code",0);
        }else {
            map.put("bookList",bookList);
            map.put("code",1);
        }
        return map;
    }
}
