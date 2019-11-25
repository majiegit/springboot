package com.mj.springboot.controller;


import com.mj.springboot.entriy.Commen;
import com.mj.springboot.entriy.User;
import com.mj.springboot.service.CommenService;
import com.mj.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommenController {
    @Autowired
    private CommenService commenService;
    @PostMapping("/commen")
    public Boolean  hello(@RequestBody Commen commen){

        boolean save = commenService.save(commen);
        return save;
    }


}