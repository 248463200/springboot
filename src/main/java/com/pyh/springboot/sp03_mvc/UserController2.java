package com.pyh.springboot.sp03_mvc;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController2 {

    @GetMapping("/hello")
    public String hello(){
        return "hello,springboot";
    }
}
