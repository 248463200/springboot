package com.pyh.springboot.sp04_mybatis.common.bean;

import java.util.List;
import java.util.Map;

public interface CommonMapper<T> {


    List<T> list(Map<String, Object> map);

}
