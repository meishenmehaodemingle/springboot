package com.vip.demo.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


@Component
@ConfigurationProperties("person")
@Data
public class PersonProperties {
    private String name;
    private List<String> address;
    private Date createDate;
}
