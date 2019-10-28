package com.mj.springboot.controller;


import com.mj.springboot.entriy.User;
import com.mj.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public List<User> hello(){
        List<User> list = userService.list();
        return list;
    }

}
