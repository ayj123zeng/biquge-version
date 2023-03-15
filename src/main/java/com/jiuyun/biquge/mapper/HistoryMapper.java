package com.jiuyun.biquge.mapper;
import org.apache.ibatis.annotations.Param;

import com.jiuyun.biquge.bean.History;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Entity com.jiuyun.biquge.bean.History
 */
public interface HistoryMapper extends BaseMapper<History> {
    List<History> getAllByUserId(Integer userId);
}




