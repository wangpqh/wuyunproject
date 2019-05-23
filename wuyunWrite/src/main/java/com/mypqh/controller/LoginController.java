package com.mypqh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import wuyun.mapper.LoginMapper;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public boolean login(@RequestParam("name") String username, @RequestParam("password") String password, HttpSession session) {
      LoginMapper loginMapper = null;
      if(loginMapper.selectForLogin(username,password)!=null){
//            session.;
          return true;
      }

        return false;
    }
}
