package com.example.controller;

import com.example.domain.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public String test1(){
        List<User> list=userService.findAll();
        return list.toString();
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(@RequestBody User user){
        userService.add(user);
        return user.toString();
    }
}
