package com.mypqh.service;

import com.mypqh.bean.User;

public interface UserService {
    public User selectForLogin(String username, String password);
    public void registerInsert(User user);
}
