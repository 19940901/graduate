package com.example.graduate.mapper;

import com.example.graduate.pojo.UserInfo;

public interface UserInfoMapper {

    void createUser(String tel, String pwd);

    UserInfo getUser(Integer id);

    void updateUser(String user_id, String nickName);

    void deleteUserByUserId(Integer id);

}
