package com.hay.provide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.hay.provide.mapper")
@EnableDiscoveryClient
public class ServiceProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvideApplication.class, args);
    }

}
