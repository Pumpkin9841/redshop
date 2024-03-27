package com.zongwu.redshop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.zongwu.redshop.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class RedshopProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedshopProductApplication.class, args);
    }
}
