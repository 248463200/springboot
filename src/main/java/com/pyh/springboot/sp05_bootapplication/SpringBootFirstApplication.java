package com.pyh.springboot.sp05_bootapplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;

@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class SpringBootFirstApplication {

    //启动的逻辑不分析
    public static void main(String[] args) {
        /*ConfigurableApplicationContext ca=
                SpringApplication.run(SpringBootFirstApplication.class, args);

        String[] beanDefs=ca.getBeanDefinitionNames();
        for(String str:beanDefs){
            System.out.println(str);
        }*/

    }

}
