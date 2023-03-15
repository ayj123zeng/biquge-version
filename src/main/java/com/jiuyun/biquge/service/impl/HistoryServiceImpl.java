package com.jiuyun.biquge.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiuyun.biquge.bean.History;
import com.jiuyun.biquge.service.HistoryService;
import com.jiuyun.biquge.mapper.HistoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
public class HistoryServiceImpl extends ServiceImpl<HistoryMapper, History>
    implements HistoryService{

    @Resource
    private HistoryMapper historyMapper;

    @Override
    public List<History> getAllByUserId(Integer userId) {
        return historyMapper.getAllByUserId(userId);
    }
}




