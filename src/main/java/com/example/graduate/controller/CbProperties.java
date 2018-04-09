package com.example.graduate.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(value = "cb")
public class CbProperties {


    private  String name;

    private  String age;

    private Girl girl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "CbProperties{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
               ", girl=" + girl +

                '}';
    }

}
