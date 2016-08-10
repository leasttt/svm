package com.master.svmDemo.service.impl;

import com.master.svmDemo.mapper.UserMapper;
import com.master.svmDemo.model.User;
import com.master.svmDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tanzheng on 16/8/9.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(String userId) {
        return userMapper.getUser(userId);
    }

    public User getUser2(String userId, int userAge) {
        return userMapper.getUser2(userId, userAge);
    }

    public User getUser3(int userId) {
        return userMapper.getUser3(userId);
    }

}
