package com.minibike.bike.user.controller;

import com.minibike.bike.user.dao.UserMapper;
import com.minibike.bike.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Qi on 2017/11/30.
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/hello")
    public User hello(){

        User user=userMapper.selectByPrimaryKey(1L);

        return user;
    }
}
