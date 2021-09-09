package com.hay.provide.service;

import com.hay.provide.mapper.UserMapper;
import com.hay.provide.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @title: UserService
 * @Author HuangYan
 * @Date: 2020/7/11 21:14
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUserById(String uid) {
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return userMapper.getUserById(uid);
    }
}
