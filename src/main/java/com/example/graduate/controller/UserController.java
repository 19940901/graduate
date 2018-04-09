package com.example.graduate.controller;

import com.example.graduate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 添加用户
     * name,password
     */
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public void createUser(@RequestParam("name") String name, @RequestParam("password") String password) {
        userService.createUser(name, password);
    }


}
