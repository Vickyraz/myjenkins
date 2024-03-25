package com.jenkins.test.myjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {

    @GetMapping(path="/hello")
    public String getHello(@RequestParam String name){
        return "Hello " + name;
    }
}
