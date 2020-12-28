package com.cykj.controller;

import com.cykj.entity.FileUpload;
import com.cykj.entity.User;
import com.cykj.service.MyFileService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/MyFile")
@SessionAttributes("user")
public class MyFileController {

    @Autowired
    private MyFileService myFileService;

    @RequestMapping(value = "/getView")
    public String getView(){

        return "MyFile";
    }






    @RequestMapping(value = "/getSelect")
    @ResponseBody
    public Map<String,Object> selectTable(@RequestParam String limit, @RequestParam String page, HttpServletRequest request ){
        User getUser= (User) request.getSession().getAttribute("user");
        int newPage=Integer.parseInt(page);
        int newLimit=Integer.parseInt(limit);
        int userid=getUser.getUserId();
        String beginTime=request.getParameter("beginTime");
        String endTime=request.getParameter("endTime");
        String fileType=request.getParameter("FileType");
        String checkState=request.getParameter("checkState");
        Map<String,Object> map=new HashMap<>();
        map.put("beginTime",beginTime);
        map.put("endTime",endTime);
        map.put("FileType",fileType);
        map.put("checkState",checkState);
        map.put("userid",userid);
        RowBounds rb=new RowBounds((newPage-1)*newLimit,newLimit);
        List<FileUpload> fileUploadList=myFileService.selectTable(rb,map);
        Map<String,Object> hasMap=new HashMap<>();
        hasMap.put("code",0);
        hasMap.put("msg","");
        hasMap.put("count",myFileService.selectCount(map));
        hasMap.put("data",fileUploadList);
        return hasMap;
    }

}
