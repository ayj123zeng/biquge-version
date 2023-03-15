package com.jiuyun.biquge.controller;

import com.jiuyun.biquge.bean.Book;
import com.jiuyun.biquge.bean.Classify;
import com.jiuyun.biquge.service.ClassService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: abb
 * @DateTime: 2023-03-11 19:51
 * @Description: TODO
 **/
@RestController
@RequestMapping("/class")
public class ClassController {
    @Resource
    private ClassService classService;

    @PostMapping("/getAll")
    public Map<String,Object> getAll(){
        Map<String,Object> map =new HashMap<>();
        List<Classify> classList = classService.getAllAndBook();
        if (classList.isEmpty()){
            map.put("code",0);
        }else {
            map.put("classList",classList);
            map.put("code",1);
        }

        return map;
    }
}
