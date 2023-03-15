package com.jiuyun.biquge.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiuyun.biquge.bean.Collection;
import com.jiuyun.biquge.service.CollectionService;
import com.jiuyun.biquge.mapper.CollectionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.List;

/**
 *
 */
@Service
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Collection>
    implements CollectionService{

    @Resource
    private CollectionMapper collectionMapper;

    @Override
    public List<Collection> getCollectionBookListByUserId(Integer userId) {
        return collectionMapper.getCollectionBookListByUserId(userId);
    }

    @Override
    public int insertBookToCollection(Integer userId, Integer bookId) {
        return collectionMapper.insert(Collection.builder().collectionUserId(userId).collectionStatus(1).collectionBookId(bookId).build());
    }

    @Override
    public int deleteBookToCollection(Integer userId, Integer bookId) {
        LambdaQueryWrapper<Collection> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(Collection::getCollectionUserId,userId).eq(Collection::getCollectionBookId,bookId);
        return collectionMapper.delete(queryWrapper);
    }
}




