package com.example.graduate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class TestController {

    @Autowired
    private CbProperties cbProperties;

    @Autowired
    private DBProperties db;

    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        return "this is springboot";
    }


    @RequestMapping(value = "/me", method = RequestMethod.GET)
    public CbProperties getCbProperties() {
        return cbProperties;
    }

    @RequestMapping(value="/db",method = RequestMethod.GET)
    public DBProperties getDb(){
        return db;
    }


}
