package com.pyh.springboot.sp04_mybatis.service;


import com.pyh.springboot.sp04_mybatis.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> list(Map<String, Object> map);

}
