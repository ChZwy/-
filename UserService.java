package com.chenghuan.map.service;

import com.chenghuan.map.entity.User;


public interface UserService {

    public User findByName(String name);

    public int saveUser(User user);


}
