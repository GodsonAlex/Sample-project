package com.sampleApplication.sample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


    @GetMapping(value = "/")
    public String hello(){
        return "Hello World";
    }


}
