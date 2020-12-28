package com.cykj.service;

import com.cykj.entity.FileUpload;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface MyFileService {
    public List<FileUpload> selectTable(RowBounds rb, Map<String, Object> map);
    public int selectCount(Map<String, Object> map);
}
