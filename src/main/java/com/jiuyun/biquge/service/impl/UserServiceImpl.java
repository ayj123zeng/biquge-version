package com.jiuyun.biquge.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiuyun.biquge.bean.User;
import com.jiuyun.biquge.service.UserService;
import com.jiuyun.biquge.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




