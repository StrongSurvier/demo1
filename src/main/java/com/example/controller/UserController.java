package com.example.controller;

import com.example.domain.User;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping("/list")
//    @ResponseBody
    public String test1(){
        List<User> list=userService.findAll();
        return list.toString();
    }

    @RequestMapping("/add")
//    @ResponseBody
    public String add(@RequestBody User user){
        userService.add(user);
        return user.toString();
    }
    
    @RequestMapping("/del/{id}")
//    @ResponseBody
    public String add(@PathVariable("id") int id){
        userService.del(id);
        return "success";
    }

    @RequestMapping("/del")
//    @ResponseBody
    public String batchDel(@RequestParam("ids[]") Integer[] ids){
        userService.batchDel(ids);
        return "success";
    }

    @RequestMapping("/batchAdd")
    public String batchInsert(@RequestBody User user){
        for (int i = 0; i <10 ; i++) {
            user.setAge(user.getAge()+1);
            userService.add(user);
        }
        return "add success";
    }
}
