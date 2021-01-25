package com.pyh.springboot.sp04_mybatis.controller;

import com.pyh.springboot.sp04_mybatis.common.bean.ResultBean;
import com.pyh.springboot.sp04_mybatis.entity.UserEntity;
import com.pyh.springboot.sp04_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/getuser")
    public ResultBean getUserList(){
        Map<String,Object> condition = new HashMap<String, Object>();
        condition.put("id",1);
        List<UserEntity> u1 =  userService.list(condition);
        return new ResultBean(u1);
    }
}
