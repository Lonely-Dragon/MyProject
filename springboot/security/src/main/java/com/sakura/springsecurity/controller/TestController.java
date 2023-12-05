package com.sakura.springsecurity.controller;

import com.sakura.springsecurity.service.UserService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sakura
 */
@RestController
@RequestMapping(path = "test")
public class TestController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping(path = "/getUser")
    public Object getUser(){
        return userService.getUser();
    }
    
}
