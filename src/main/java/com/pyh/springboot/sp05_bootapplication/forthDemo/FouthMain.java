package com.pyh.springboot.sp05_bootapplication.forthDemo;

import com.pyh.core.pyhCore;
import com.pyh.springboot.sp05_bootapplication.thirdDemo.EnableDemoMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class FouthMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca= SpringApplication.run(EnableDemoMain.class,args);
        System.out.println(ca.getBean(pyhCore.class).study());
    }
}
