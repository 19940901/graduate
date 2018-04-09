package com.example.graduate.service;

import com.example.graduate.mapper.UserInfoMapper;
import com.example.graduate.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserInfoImpl implements UserInfoMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(String name, String pwd) {
        jdbcTemplate.update("INSERT INTO hadoop.user(user_name,password) VALUES (?,md5(?))", name, pwd);
    }

    @Override
    public UserInfo getUser(Integer id) {
        List<UserInfo> userList = jdbcTemplate.query("select user_name,password FROM hadoop.user WHERE user_id = ?",
                new Object[]{id}, new BeanPropertyRowMapper(UserInfo.class));
        if (userList != null && userList.size() > 0) {
            UserInfo user = userList.get(0);
            return user;
        } else {
            return null;
        }
    }

    @Override
    public void updateUser(String user_id, String name) {
        jdbcTemplate.update("UPDATE hadoop.user SET user_name = ? WHERE user_id = ?", name, user_id);
    }

    @Override
    public void deleteUserByUserId(Integer id) {
        jdbcTemplate.update("DELETE FROM hadoop.user WHERE user_id = ?", id);
    }

}
