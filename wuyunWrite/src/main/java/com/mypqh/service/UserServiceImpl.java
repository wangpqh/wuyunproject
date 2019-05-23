package com.mypqh.service;

import com.mypqh.bean.User;
import com.mypqh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectForLogin(String username, String password) {
        User user=userMapper.selectForLogin(username, password);
        return user;
    }

    @Override
    public void registerInsert(User user) {
        userMapper.registerInsert(user);
    }
}
