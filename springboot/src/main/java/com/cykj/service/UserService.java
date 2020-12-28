package com.cykj.service;

import com.cykj.entity.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface UserService {

    public List<User> userSelectTable(Map<String, Object> hasMap, RowBounds rb);
    public int userSelectCount(Map<String, Object> hasMap);
}
