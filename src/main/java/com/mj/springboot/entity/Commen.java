package com.mj.springboot.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("commen")
public class Commen {
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    private String test;
    private String name;
}


