package com.zongwu.redshop.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.zongwu.redshop.coupon.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class RedshopCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedshopCouponApplication.class, args);
    }

}
