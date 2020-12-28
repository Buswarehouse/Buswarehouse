package com.cykj.service.Impl;

import com.cykj.entity.User;
import com.cykj.mapper.UserMapper;
import com.cykj.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> userSelectTable(Map<String,Object> hasMap, RowBounds rb) {
        List<User> userList=userMapper.userSelectTable(hasMap,rb);
        return userList;
    }

    @Override
    public int userSelectCount(Map<String,Object> hasMap) {
        int flag=userMapper.userSelectCount(hasMap);
        return flag;
    }
}
