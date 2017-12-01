package com.minibike.bike.user.service;

import com.minibike.bike.user.dao.UserMapper;
import com.minibike.bike.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Qi on 2017/11/30.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login() {
        User user=new User();
        user.setId(1L);
        userMapper.insertSelective(user);
        return null;
    }
}
