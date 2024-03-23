package com.zongwu.redshop.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zongwu.redshop.ware.dao")
@SpringBootApplication
public class RedshopWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedshopWareApplication.class, args);
    }

}
