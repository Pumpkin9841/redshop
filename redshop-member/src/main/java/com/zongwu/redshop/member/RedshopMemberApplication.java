package com.zongwu.redshop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.zongwu.redshop.member.dao")
@EnableFeignClients(basePackages = "com.zongwu.redshop.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class RedshopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedshopMemberApplication.class, args);
    }

}
