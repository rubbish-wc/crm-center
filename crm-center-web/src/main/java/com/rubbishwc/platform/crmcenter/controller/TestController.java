package com.rubbishwc.platform.crmcenter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public String hello(){
        return "hello world";
    }
}
