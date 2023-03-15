package com.jiuyun.biquge;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jiuyun.biquge.mapper")
public class BiqugeVersionApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiqugeVersionApplication.class, args);
    }

}
