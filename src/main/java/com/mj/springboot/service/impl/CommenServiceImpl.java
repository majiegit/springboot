package com.mj.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mj.springboot.entity.Commen;
import com.mj.springboot.mapper.CommenMapper;
import com.mj.springboot.service.CommenService;
import org.springframework.stereotype.Service;


@Service
public class CommenServiceImpl extends ServiceImpl<CommenMapper, Commen> implements CommenService {
}
