package com.pyh.springboot.sp05_bootapplication.thirdDemo;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CacheImportSelector.class}) //
public @interface EnableDefineService {

    //配置一些方法
    Class<?>[] exclude() default {};
}
