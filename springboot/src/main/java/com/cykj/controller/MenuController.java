package com.cykj.controller;


import com.cykj.entity.AdminUser;
import com.cykj.entity.Menu;
import com.cykj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(value = "/Backstage")
public class MenuController {

    @RequestMapping(value = "/getView")
    public ModelAndView getView(ModelMap modelMap) {
        AdminUser adminUser= (AdminUser) modelMap.get("adminUser");
        ModelAndView modelAndView = new ModelAndView("Backstage");
        modelAndView.addObject("adminUser",adminUser);
        return modelAndView;
    }

    @RequestMapping("/skip")
    public class SkipPageController {
        @Autowired
        MenuService menuService;

        @RequestMapping("/backPage")
        public ModelAndView backPage(Model model) {
            HashMap<String, List<Menu>> map = menuService.findMen(0);
            model.addAttribute("map", map);
            return new ModelAndView("Backstage");

        }
    }
}
