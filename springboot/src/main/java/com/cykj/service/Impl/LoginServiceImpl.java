package com.cykj.service.Impl;

import com.cykj.entity.User;
import com.cykj.mapper.UserMapper;
import com.cykj.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User loginCheck(User user) {
       User users = userMapper.selectUser(user);
       return users;
    }

}
