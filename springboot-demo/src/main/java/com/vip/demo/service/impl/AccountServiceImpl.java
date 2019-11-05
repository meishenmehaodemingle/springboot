package com.vip.demo.service.impl;

import com.vip.demo.domain.entity.User;
import com.vip.demo.mapper.UserMapper;
import com.vip.demo.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    UserMapper userMapper;


    @Override
    public User save(User user) {
        int insert = userMapper.insert(user);
        log.debug("" + insert);
        return user;
    }
}
