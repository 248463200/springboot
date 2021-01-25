package com.pyh.springboot.sp02_jsr303;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "jsr303")
@Data
@Validated
public class Jsr303 {
    private String id;
    @NotNull
    private String lastName;
    private Date birth;
    private List<String> books;
    private Map<String,String> cards;
    @Email(message = "eamil格式有误")
    private String email;
}

