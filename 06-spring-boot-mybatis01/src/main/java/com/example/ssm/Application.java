package com.example.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ssm.mapper")//去哪扫描Mybatis的mapper接口
public class Application {

    public static void main(String[] args) {
        System.out.println("分支操作");
        SpringApplication.run(Application.class, args);
    }

}
