package com.example.service.impl;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void del(int id) {
        userMapper.del(id);
    }

    @Override
    public void batchDel(Integer[] ids) {
        for (int i = 0; i <ids.length; i++) {
            userMapper.del(ids[i]);
        }
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }
}
