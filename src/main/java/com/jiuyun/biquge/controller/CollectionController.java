package com.jiuyun.biquge.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jiuyun.biquge.bean.Collection;
import com.jiuyun.biquge.bean.User;
import com.jiuyun.biquge.service.CollectionService;
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
 * @DateTime: 2023-03-14 16:35
 * @Description: TODO
 **/
@RestController
@RequestMapping("/collection")
public class CollectionController {
    @Resource
    private CollectionService collectionService;

    @PostMapping("/getAllCollectionByUserId")
    public Map<String, Object> getAllCollectionByUserId(Integer userId) {
        Map<String, Object> map = new HashMap<>();
        List<Collection> collectionList = collectionService.getCollectionBookListByUserId(userId);
        if (collectionList.isEmpty()) {
            map.put("code", 0);
        }else {
            map.put("collectionList", collectionList);
            map.put("code", 1);
        }
        return map;
    }

    @PostMapping("/insertBookToCollection")
    public Map<String, Object> insertBookToCollection(Integer userId, Integer bookId) {
        Map<String, Object> map = new HashMap<>();
        int i = collectionService.insertBookToCollection(userId, bookId);
        if (i == 0) {
            map.put("code", 0);
        } else {
            map.put("code", 1);
        }
        return map;
    }

    @PostMapping("/deleteBookToCollection")
    public Map<String, Object> deleteBookToCollection(Integer userId, Integer bookId) {
        Map<String, Object> map = new HashMap<>();
        int i = collectionService.deleteBookToCollection(userId, bookId);
        if (i == 0) {
            map.put("code", 0);
        } else {
            map.put("code", 1);
        }
        return map;
    }

    @PostMapping("/selectCollectionByUserIdAndBookId")
    public Map<String, Object> selectCollectionByUserIdAndBookId(Integer userId, Integer bookId) {
        Map<String, Object> map = new HashMap<>();
        LambdaQueryWrapper<Collection> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Collection::getCollectionUserId,userId).eq(Collection::getCollectionBookId,bookId);
        List<Collection> collectionList = collectionService.list(queryWrapper);
        if (collectionList.isEmpty()){
            map.put("code", 0);
        }else {
            map.put("code", 1);
        }
        return map;
    }

}
