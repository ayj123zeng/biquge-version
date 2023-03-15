package com.jiuyun.biquge.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiuyun.biquge.bean.Book;
import com.jiuyun.biquge.bean.Chapter;
import com.jiuyun.biquge.service.ChapterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: abb
 * @DateTime: 2023-03-13 16:24
 * @Description: TODO
 **/
@RestController
@RequestMapping("/chapter")
public class ChapterController {
    @Resource
    private ChapterService chapterService;

    @PostMapping("/getAllChapterByBookId")
    public Map<String,Object> getAllChapterByBookId(Integer bookId){
        Map<String,Object> map=new HashMap<>();
        QueryWrapper<Chapter> wrapper = new QueryWrapper<>();
        wrapper.eq("chapter_book_id", bookId).orderByAsc("chapter_number");
        List<Chapter> chapterList = chapterService.list(wrapper);
        if (chapterList.isEmpty()){
            map.put("code",0);
        }
        map.put("chapterList",chapterList);
        map.put("code",1);
        return map;
    }

    @PostMapping("/getAllChapterByBookIdByPage")
    public Map<String,Object> getAllChapterByBookIdByPage(Integer bookId,Integer pageIndex,Integer pageSize){
        System.out.println("abb");
        Map<String,Object> map=new HashMap<>();
        LambdaQueryWrapper<Chapter> queryWrapper=new LambdaQueryWrapper<>();
        Page<Chapter> page = new Page<>(pageIndex,pageSize);
        queryWrapper.eq(Chapter::getChapterBookId,bookId).orderByAsc(Chapter::getChapterNumber);
        Page<Chapter> chapterPage = chapterService.selectPage(page, queryWrapper);
        List<Chapter> chapterList = chapterPage.getRecords();
        if (chapterList.isEmpty()){
            map.put("code",0);
        }else {
            map.put("chapterList",chapterList);
            map.put("code",1);
        }
        return map;
    }
}
