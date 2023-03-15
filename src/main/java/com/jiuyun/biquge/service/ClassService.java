package com.jiuyun.biquge.service;

import com.jiuyun.biquge.bean.Classify;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface ClassService extends IService<Classify> {
    List<Classify> getAllAndBook();
}
