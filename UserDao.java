package com.chenghuan.map.dao;

import com.chenghuan.map.entity.User;


public interface UserDao {

    public User findByName(String name);

    public int saveUser(User user);


}
