package com.cykj.service;

import com.cykj.entity.User;
import com.cykj.entity.UserScore;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface MyScoreService {
    public List<UserScore> selectTable(RowBounds rb, User user);
    public int selectCount(User user);
}
