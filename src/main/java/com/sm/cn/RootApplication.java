package com.sm.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.sm.cn.mapper")
public class RootApplication {
    public static void main(String[] args) {
        SpringApplication.run(RootApplication.class);
    }
}
