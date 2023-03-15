package com.jiuyun.biquge.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jiuyun.biquge.bean.User;
import com.jiuyun.biquge.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: abb
 * @DateTime: 2023-03-14 10:06
 * @Description: TODO
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/getUser")
    public Map<String,Object> getUser(String username,String password){
        Map<String,Object> map =new HashMap<>();
        LambdaQueryWrapper<User> queryWrapper=new LambdaQueryWrapper<User>();
        queryWrapper.eq(User::getUserName,username).eq(User::getPassword,password);
        List<User> userList = userService.list(queryWrapper);
        if (userList.isEmpty()){
            map.put("code",0);
        }else {
            User user = userList.get(0);
            map.put("user",user);
            map.put("code",1);
        }
        return map;
    }
}
