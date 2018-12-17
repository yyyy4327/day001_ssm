package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findall")
    public String findAll(Model model){
        List<User> all = userService.findAll();
        model.addAttribute("list",all);
        return "aaa";
    }
}
