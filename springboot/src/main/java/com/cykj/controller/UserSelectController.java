package com.cykj.controller;

import com.cykj.entity.User;
import com.cykj.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/FindUser")
@Controller
public class UserSelectController {
    @Autowired
    private UserService userService;
    @Autowired
    private User user;

    //返回页面
    @RequestMapping(value = "/FindUser")
    public String getView() {
        return "FindUser";
    }

    @RequestMapping(value = "/getSelectTable")
    @ResponseBody
    public Map<String,Object> getSelectTable(@RequestParam String limit, @RequestParam String page, HttpServletRequest request){
        int newPage=Integer.parseInt(page);
        int newLimit=Integer.parseInt(limit);
        String beginTime=request.getParameter("beginTime");
        String endTime=request.getParameter("endTime");
        String demoReload=request.getParameter("demoReload");
        Map<String,Object> hasMap=new HashMap<>();
        hasMap.put("beginTime",beginTime);
        hasMap.put("endTime",endTime);
        hasMap.put("demoReload",demoReload);
        RowBounds rb=new RowBounds((newPage-1)*newLimit,newLimit);
        List<User> users=userService.userSelectTable(hasMap,rb);
        Map<String,Object> map= new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",userService.userSelectCount(hasMap));
        map.put("data",users);
        return map;
    }
}
