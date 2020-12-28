package com.cykj.mapper;

import com.cykj.entity.FileUpload;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileUploadMapper {
    public int insertTable(FileUpload fileUpload);
    //搜索文档显示列表
    public List<FileUpload> flies(RowBounds rb, FileUpload fileUpload);
    //查询数量，搜索文档
    public int selectCount(FileUpload fileUpload);
}
