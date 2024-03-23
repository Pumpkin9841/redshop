package com.zongwu.redshop.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zongwu.redshop.order.dao")
@SpringBootApplication
public class RedshopOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedshopOrderApplication.class, args);
    }

}
