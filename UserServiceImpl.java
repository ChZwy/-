package com.chenghuan.map.service.impl;

import com.chenghuan.map.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenghuan.map.dao.UserDao;
import com.chenghuan.map.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByName(String name) {
        User user = userDao.findByName(name);
        return user;
    }

    @Override
    public int saveUser(User user) {
        int result = userDao.saveUser(user);
        return result;
    }

}
