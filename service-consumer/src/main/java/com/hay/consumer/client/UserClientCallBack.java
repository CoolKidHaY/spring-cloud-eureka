package com.hay.consumer.client;

import org.springframework.stereotype.Component;


/**
 * @title: UserClient的熔断方法
 * @Author HuangYan
 * @Date: 2020/7/13 17:15
 * @Version 1.0
 */
@Component
public class UserClientCallBack implements UserClient{

    @Override
    public String getUserById(String uid) {
        return new String("请求超时，请稍后再试！");
    }
}
