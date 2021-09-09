package com.hay.consumer.controller;

import com.hay.consumer.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @title: UserController
 * @Author HuangYan
 * @Date: 2020/7/11 22:24
 * @Version 1.0
 */
@Controller
@RequestMapping("user")
//@DefaultProperties(defaultFallback = "fallbackMethod")  // 配置熔断全局默认方法
public class UserController {

//    @Autowired
//    RestTemplate restTemplate;

//    @Autowired
//    DiscoveryClient discoveryClient;

    @Autowired
    UserClient userClient;

//    @ResponseBody
//    @HystrixCommand //配置指定的熔断方法
    @RequestMapping("{uid}")
    @ResponseBody
    public String getUserById(@PathVariable("uid") String uid){
//        List<InstanceInfo> instances = discoveryClient.getInstancesById("service-provide");
//        InstanceInfo instanceInfo = instances.get(0);
//        int port = instanceInfo.getPort();
//        String url = "http://service-provide/user/"+uid;
//        String user = restTemplate.getForObject(url, String.class);
//        return user;

        return userClient.getUserById(uid); //使用feign来转发请求
    }

//    /**
//     * 默认的熔断方法
//     * @return
//     */
//    public String callbackMethod(){
//        return "服务器超时，请稍后再试！(默认)";
//    }
//
//    /**
//     * 指定的熔断方法
//     * @return
//     */
//    public String callbackMethod2(String uid){
//        return "服务器超时，请稍后再试！(指定)";
//    }


}
