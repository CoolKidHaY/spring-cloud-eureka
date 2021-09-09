package com.hay.provide.mapper;

import com.hay.provide.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where uid = #{uid}")
    public User getUserById(String uid);
}