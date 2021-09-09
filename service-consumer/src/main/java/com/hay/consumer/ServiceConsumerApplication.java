package com.hay.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;

//@SpringBootApplication
//@EnableDiscoveryClient    //开启注册中心
//@EnableCircuitBreaker     //开启熔断机制
@SpringCloudApplication //此注解等于上面三个注解:
@EnableFeignClients(defaultConfiguration = FeignClientsConfiguration.class)     //开启feign功能，其集成了ribbon和hystrix
public class ServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerApplication.class, args);
    }

//    @Bean
//    @LoadBalanced   //开启负载均衡
//    public RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}
