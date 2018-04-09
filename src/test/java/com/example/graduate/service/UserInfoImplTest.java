package com.example.graduate.service;

import com.example.graduate.pojo.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserInfoImplTest {
    @Autowired
    UserService userService;


    @Test
    public void createUser() {
        userService.createUser("曹斌","123456");
    }

    @Test
    public void getUser() {
        UserInfo user = userService.getUser(6);
        System.out.println(user.toString());

    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUserByUserId() {

    }
}