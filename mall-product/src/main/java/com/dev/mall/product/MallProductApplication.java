package com.dev.mall.product;

import com.dev.mall.product.entity.AttrEntity;
import com.dev.mall.product.service.AttrService;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.Resource;

@MapperScan("com.dev.mall.product.dao")
@SpringBootApplication
//@EnableDiscoveryClient
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }
}
