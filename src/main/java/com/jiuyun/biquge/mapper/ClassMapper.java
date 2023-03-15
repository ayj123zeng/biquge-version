package com.jiuyun.biquge.mapper;

import com.jiuyun.biquge.bean.Classify;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Entity com.jiuyun.biquge.bean.Classify
 */
public interface ClassMapper extends BaseMapper<Classify> {
    List<Classify> getAllAndBook();
}




