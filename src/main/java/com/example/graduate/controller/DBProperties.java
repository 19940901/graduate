package com.example.graduate.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/*
url: jdbc:mysql://119.23.213.11:3306/hadoop
  name: hadoop
  password: hadoop200Cb.
  driver-class-name: com.mysql.jdbc.Driver
  type: com.alibaba.druid.pool.DruidDataSource
 */
@Component
@ConfigurationProperties(prefix = "mysql")
public class DBProperties {
    private String name;
    private String url;
    private String password;
    //private String driver-class-name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return url;
    }

    public void setHost(String host) {
        this.url = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DBProperties{" +
                "name='" + name + '\'' +
                ", host='" + url + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
