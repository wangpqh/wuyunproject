package com.mypqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class ProTestController {
    @RequestMapping("/test")
    public ModelAndView handleRequest(HttpServletRequest r, HttpServletResponse response){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg","this is wuyun project test");
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }
}
