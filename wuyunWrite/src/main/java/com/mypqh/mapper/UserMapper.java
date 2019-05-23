package com.mypqh.mapper;

import com.mypqh.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User selectForLogin(@Param("username") String username, @Param("password") String password);
    public void registerInsert(User user);
}
