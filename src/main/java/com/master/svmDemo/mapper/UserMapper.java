package com.master.svmDemo.mapper;

import com.master.svmDemo.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by tanzheng on 16/8/9.
 */
public interface UserMapper{
    @Select("SELECT * FROM users WHERE id = #{userId}")
    User getUser(@Param("userId") String userId);

    @Select("SELECT * FROM users WHERE id = #{userId} AND age > #{userAge}")
    User getUser2(@Param("userId") String userId, @Param("userAge") int userAge);

    User getUser3(int id);
}
