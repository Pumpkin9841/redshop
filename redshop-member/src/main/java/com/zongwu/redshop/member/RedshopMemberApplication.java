package com.zongwu.redshop.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zongwu.redshop.member.dao")
@SpringBootApplication
public class RedshopMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedshopMemberApplication.class, args);
    }

}
