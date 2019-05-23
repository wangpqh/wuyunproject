package com.mypqh.controller;

import com.mypqh.bean.User;
import com.mypqh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/login",method = RequestMethod.POST)
    @ResponseBody
    public User login(String username, String password, HttpSession session) {
        User user= userService.selectForLogin(username, password);

        if (user!=null){
            user.setLoginStat(1);
            session.setAttribute("usersession",user);
            System.out.println("++++++"+user.toString());
            return user;
        }else {
            System.out.println("++++++fail");
            return null;
        }

    }
    @RequestMapping(value="/user/register",method = RequestMethod.POST)
    @ResponseBody
    public int register(String username, String password) {
        User user =new User();
        user.setUserid(username);
        user.setPassword(password);
        user.setLoginStat(0);
        System.out.println("++++++"+user.toString());
        userService.registerInsert(user);
//        if(){
//            System.out.println("注册成功");
//        }
        return 0;

    }

}
