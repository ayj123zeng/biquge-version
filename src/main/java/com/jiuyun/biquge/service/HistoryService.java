package com.jiuyun.biquge.service;

import com.jiuyun.biquge.bean.History;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface HistoryService extends IService<History> {
    List<History> getAllByUserId(Integer userId);
}
