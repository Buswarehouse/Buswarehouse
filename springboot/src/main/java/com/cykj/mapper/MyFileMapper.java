package com.cykj.mapper;

import com.cykj.entity.FileUpload;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MyFileMapper {
    public List<FileUpload> selectTable(RowBounds rb, Map<String, Object> map);
    public int selectCount(Map<String, Object> map);
}
