package com.pyh.springboot.sp04_mybatis.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index/login")
    public String login() {
        return "index";
    }
}
