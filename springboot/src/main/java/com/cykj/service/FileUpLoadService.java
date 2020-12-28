package com.cykj.service;

import com.cykj.entity.FileUpload;
import org.apache.ibatis.session.RowBounds;
import java.util.List;

public interface FileUpLoadService {
    public int insertTable(FileUpload fileUpload);

    public List<FileUpload> flies(RowBounds rb, FileUpload fileUpload);

    public int selectCount(FileUpload fileUpload);


}
