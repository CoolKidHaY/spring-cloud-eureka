package com.hay.provide.controller;

import com.hay.provide.pojo.User;
import com.hay.provide.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @title: UserController
 * @Author HuangYan
 * @Date: 2020/7/11 21:13
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("{uid}")
    @ResponseBody
    public User getUserById(@PathVariable("uid") String uid) {
        return userService.getUserById(uid);
    }
}