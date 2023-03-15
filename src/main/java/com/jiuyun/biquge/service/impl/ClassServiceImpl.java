package com.jiuyun.biquge.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiuyun.biquge.bean.Classify;
import com.jiuyun.biquge.service.ClassService;
import com.jiuyun.biquge.mapper.ClassMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Classify>
    implements ClassService{
    @Resource
    private ClassMapper classMapper;

    @Override
    public List<Classify> getAllAndBook() {
        return classMapper.getAllAndBook();
    }
}




