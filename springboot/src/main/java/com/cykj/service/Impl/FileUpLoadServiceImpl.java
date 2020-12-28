package com.cykj.service.Impl;

import com.cykj.entity.FileUpload;
import com.cykj.mapper.FileUploadMapper;
import com.cykj.service.FileUpLoadService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileUpLoadServiceImpl implements FileUpLoadService {
    @Autowired
    private FileUploadMapper fileUploadMapper;

//    @Autowired
//    public FileUpLoadServiceImpl(FileUploadMapper fileUploadMapper) {
//
//        this.fileUploadMapper=fileUploadMapper;
//    }

    @Override
    public int insertTable(FileUpload fileUpload) {
        int flag=fileUploadMapper.insertTable(fileUpload);
        return flag;
    }

    @Override
    public List<FileUpload> flies(RowBounds rb, FileUpload fileUpload) {
        List<FileUpload> fileUploadList=fileUploadMapper.flies(rb,fileUpload);
        return fileUploadList;
    }

    @Override
    public int selectCount(FileUpload fileUpload) {
        int countNum=fileUploadMapper.selectCount(fileUpload);
        return countNum;
    }
}
