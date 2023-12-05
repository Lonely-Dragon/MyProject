package com.sakura.springsecurity.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sakura.springsecurity.entity.User;
import com.sakura.springsecurity.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author sakura
 */
@Slf4j
@Service
public class UserService {
    
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserMapper userMapper;
    
    public Object getUser(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User> ().isNotNull("id");
        Map<String,Object> result = new HashMap<>();
        result.put("data",userMapper.selectList(userQueryWrapper));
        return result;
    }
    
}
