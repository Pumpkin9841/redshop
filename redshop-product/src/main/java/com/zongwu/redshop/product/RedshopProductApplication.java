package com.zongwu.redshop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zongwu.redshop.product.dao")
@SpringBootApplication
public class RedshopProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedshopProductApplication.class, args);
    }
}
