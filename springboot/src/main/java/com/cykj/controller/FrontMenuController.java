package com.cykj.controller;

import com.cykj.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/FrontDesk")
public class FrontMenuController {

    @RequestMapping(value = "/getView2")
    public ModelAndView getView2(ModelMap modelMap) {
        User user= (User) modelMap.get("user");
        ModelAndView modelAndView = new ModelAndView("FrontDesk");
        modelAndView.addObject("user",user);
        return modelAndView;
    }


}
