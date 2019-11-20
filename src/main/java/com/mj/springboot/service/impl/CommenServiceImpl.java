package com.mj.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mj.springboot.entriy.Commen;
import com.mj.springboot.entriy.User;
import com.mj.springboot.mapper.CommenMapper;
import com.mj.springboot.mapper.UserMapper;
import com.mj.springboot.service.CommenService;
import com.mj.springboot.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class CommenServiceImpl extends ServiceImpl<CommenMapper, Commen> implements CommenService {
}
