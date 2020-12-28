package com.cykj.mapper;

import com.cykj.entity.User;
import com.cykj.entity.UserScore;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyScoreMapper {
    public List<UserScore> selectTable(RowBounds rb, User user);
    public int selectCount(User user);
}
