package com.master.svmDemo.service;

import com.master.svmDemo.model.User;

/**
 * Created by tanzheng on 16/8/9.
 */
public interface UserService {
    User getUser(String userId);
    User getUser2(String userId, int userAge);
    User getUser3(int userId);
}
