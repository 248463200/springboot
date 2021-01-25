package com.pyh.springboot.sp04_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity  implements Serializable {

        private static final long serialVersionUID = 1L;

        private Integer id;
        private String name;


}
