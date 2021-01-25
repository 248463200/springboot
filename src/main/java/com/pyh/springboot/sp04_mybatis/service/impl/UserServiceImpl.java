package com.pyh.springboot.sp04_mybatis.service.impl;

import com.pyh.springboot.sp04_mybatis.dao.UserMapper;
import com.pyh.springboot.sp04_mybatis.entity.UserEntity;
import com.pyh.springboot.sp04_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserEntity> list(Map<String,Object> map) {
        return userMapper.list(map);
    }
}
