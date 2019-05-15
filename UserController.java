package com.chenghuan.map.controller;

import com.chenghuan.map.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.chenghuan.map.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String save(@RequestBody User user){
        int result = userService.saveUser(user);
        if(result == 1)
            return "success";
        else
            return "fail";

    }

    @PostMapping("/login")
    public String login(String userName,String userPassword){
//          String name=user.getUserName();
//          String password=user.getUserPassword();
        User isUser=userService.findByName(userName);
        System.out.println(isUser.getUserName());
        if(isUser==null){
            return "noUser";
        }
        else if(userPassword== isUser.getUserPassword()){
            return "success";
        }
        else
            return "errorPassword";

    }

}
