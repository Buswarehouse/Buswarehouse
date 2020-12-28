package com.cykj.mapper;

import com.cykj.entity.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    public User selectUser(User user);
//    public User selectUserAccount(User user);
//    public User addUser(User user);

    //用户查询
    public List<User> userSelectTable(Map<String, Object> hasMap, RowBounds rb);
    public int userSelectCount(Map<String, Object> hasMap);
}
