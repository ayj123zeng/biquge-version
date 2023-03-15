package com.jiuyun.biquge.service;

import com.jiuyun.biquge.bean.Collection;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface CollectionService extends IService<Collection> {
    /**
     * 根据用户得到所有的收藏书列表
     * @param userId
     * @return
     */
    List<Collection> getCollectionBookListByUserId(Integer userId);

    /**
     * 收藏书
     * @param userId
     * @param bookId
     * @return
     */
    int insertBookToCollection(Integer userId,Integer bookId);

    /**
     * 移除收藏书
     * @param userId
     * @param bookId
     * @return
     */
    int deleteBookToCollection(Integer userId,Integer bookId);
}
