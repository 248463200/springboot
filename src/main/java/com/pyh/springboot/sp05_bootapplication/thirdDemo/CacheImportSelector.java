package com.pyh.springboot.sp05_bootapplication.thirdDemo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class CacheImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String,Object> attributes=
                annotationMetadata.getAnnotationAttributes(EnableDefineService.class.getName());
        return new String[]{LoggerService.class.getName()}; //返回的是一个固定的CacheService，为了托管到ioc容器中
    }
}
