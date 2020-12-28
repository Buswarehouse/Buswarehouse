package com.cykj.service.Impl;

import com.cykj.entity.Menu;
import com.cykj.mapper.MenuMapper;
import com.cykj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired(required = false)
    MenuMapper menuMapper;
    @Override
    public HashMap<String, List<Menu>> findMen(int pid) {
        HashMap<String,List<Menu>> menuMap=new HashMap<>();
        List<Menu> pList= menuMapper.findMenu(pid);

        for (Menu menu : pList) {
            String menuName = menu.getMenuname();
            List<Menu> menus2 = menuMapper.findMenu(menu.getMenuid());
            menuMap.put(menuName,menus2);
        }



        return menuMap;
    }
}
