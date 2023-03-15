package com.jiuyun.biquge.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jiuyun.biquge.bean.Chapter;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 *
 */
public interface ChapterService extends IService<Chapter> {
    <P extends IPage<Chapter>> P selectPage(P page, Wrapper<Chapter> queryWrapper);
}
