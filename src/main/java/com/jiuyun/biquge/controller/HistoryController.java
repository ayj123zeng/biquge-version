package com.jiuyun.biquge.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jiuyun.biquge.bean.History;
import com.jiuyun.biquge.service.HistoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: abb
 * @DateTime: 2023-03-14 18:39
 * @Description: TODO
 **/
@RestController
@RequestMapping("/history")
public class HistoryController {
    @Resource
    private HistoryService historyService;

    @PostMapping("/insertOrUpdateBookToHistory")
    public Map<String,Object> insertOrUpdateBookToHistory(Integer userId,Integer bookId,Integer chapter){
        Map<String, Object> map = new HashMap<>();
        boolean update=false;
        boolean save=false;
        List<History> historyList = historyService.list(new LambdaQueryWrapper<History>()
                .eq(History::getHistoryUserId, userId)
                .eq(History::getHistoryBookId, bookId));
        if (!historyList.isEmpty()){
            update = historyService.update(History.builder().historyUserId(userId).historyBookId(bookId).historyChapterId(chapter).build()
                    , new LambdaQueryWrapper<History>()
                            .eq(History::getHistoryUserId, userId)
                            .eq(History::getHistoryBookId, bookId));
        }else {
            save = historyService.save(History.builder().historyUserId(userId).historyBookId(bookId).historyChapterId(chapter).build());
        }
        if (update||save) {
            map.put("code", 1);
        } else {
            map.put("code", 0);
        }
        return map;
    }

    @PostMapping("/getAllByUserId")
    public Map<String,Object> getAllByUserId(Integer userId){
        Map<String,Object> map=new HashMap<>();
        List<History> historyList = historyService.getAllByUserId(userId);
        if (historyList.isEmpty()) {
            map.put("code", 0);
        }else {
            map.put("code",1);
            map.put("historyList",historyList);
        }
        return map;
    }
}
