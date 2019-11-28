package com.example.service;

import com.example.domain.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void add(User user);

    void del(int id);
}
