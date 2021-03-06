package com.tanlei.cn;

import com.tanlei.cn.mapper.PersonMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tanlei.cn.mapper")
public class Mybatis02Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis02Application.class, args);
    }

}
