package com.vip.demo.service;


import com.vip.demo.domain.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AccountServiceTest {
    @Resource
    AccountService service;

    @Test
    public void save() {
        User user = new User();
        user.setName("测试");
        User save = service.save(user);
        log.debug(save.toString());

    }
}
