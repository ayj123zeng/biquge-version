package com.jiuyun.biquge.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiuyun.biquge.bean.Chapter;
import com.jiuyun.biquge.service.ChapterService;
import com.jiuyun.biquge.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service
public class ChapterServiceImpl extends ServiceImpl<ChapterMapper, Chapter>
    implements ChapterService{
    @Resource
    private ChapterMapper chapterMapper;

    @Override
    public <P extends IPage<Chapter>> P selectPage(P page, Wrapper<Chapter> queryWrapper) {
        return chapterMapper.selectPage(page,queryWrapper);
    }
}




