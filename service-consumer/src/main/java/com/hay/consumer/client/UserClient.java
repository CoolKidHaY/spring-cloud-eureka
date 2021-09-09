package com.hay.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-provide",fallback = UserClientCallBack.class)     //指定服务id
public interface UserClient {

    @RequestMapping("/user/{uid}")
    public String getUserById(@PathVariable("uid") String uid);
}
