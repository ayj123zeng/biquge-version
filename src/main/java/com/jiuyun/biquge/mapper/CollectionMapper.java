package com.jiuyun.biquge.mapper;

import com.jiuyun.biquge.bean.Collection;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Entity com.jiuyun.biquge.bean.Collection
 */
public interface CollectionMapper extends BaseMapper<Collection> {
    List<Collection> getCollectionBookListByUserId(Integer userId);

}




