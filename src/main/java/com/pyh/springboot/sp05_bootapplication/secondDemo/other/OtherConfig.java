package com.pyh.springboot.sp05_bootapplication.secondDemo.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {

    //iff ...
    //else ..
    @Bean
    public OtherBean otherBean(){
        return new OtherBean();
    }
}
