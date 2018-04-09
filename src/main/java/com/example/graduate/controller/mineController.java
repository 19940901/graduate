package com.example.graduate.controller;
/*
可以使用@value来注解属性
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mine")
@RestController
@ConfigurationProperties(prefix = "cb")
public class mineController {
   // @Value("${cb.name}")
    private  String name;
   // @Value("${cb.age}")
    private  String age;

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
    @RequestMapping(method = RequestMethod.GET)
    public String getInfo(){
        return "cb.name :"+name+"  cb.age :"+age;
    }
}
