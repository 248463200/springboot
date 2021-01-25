package com.pyh.springboot.sp04_mybatis.dao;


import com.pyh.springboot.sp04_mybatis.common.bean.CommonMapper;
import com.pyh.springboot.sp04_mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends CommonMapper<UserEntity> {

}
