package com.cykj.service.Impl;


import com.cykj.entity.FileUpload;
import com.cykj.mapper.MyFileMapper;
import com.cykj.service.MyFileService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MyFileServiceImpl implements MyFileService {

    @Autowired
    private MyFileMapper myFileMapper;
    @Override
    public List<FileUpload> selectTable(RowBounds rb, Map<String,Object> map) {
        List<FileUpload> fileUploadList=myFileMapper.selectTable(rb,map);
        return fileUploadList;
    }

    @Override
    public int selectCount(Map<String,Object> map) {
        int tableCount=myFileMapper.selectCount(map);
        return tableCount;
    }
}
