package com.mypqh.mapper;

import com.mypqh.bean.User;

public interface LoginMapper {
    public User selectForLogin(String username, String password);
}
