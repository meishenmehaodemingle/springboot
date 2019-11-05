package com.vip.demo.controller;

import com.vip.demo.bean.PersonProperties;
import com.vip.demo.domain.entity.User;
import com.vip.demo.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangwei
 */
@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/")
    public String hello() {

        return "";
    }


    @Resource
    AccountService service;

    @RequestMapping("/save")
    public User save() {
        User user = new User();
        user.setName("测试");
        User save = service.save(user);
        return save;
    }

}
