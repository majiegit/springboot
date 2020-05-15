package com.mj.springboot.controller;


import com.mj.springboot.entity.Commen;
import com.mj.springboot.service.CommenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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