package com.sampleApplication.sample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/customers")
@RestController
public class Test {


    @GetMapping
    public String hello(){
        return "Hello World";
    }


    @GetMapping(value = "/getdata")
    public String Test(){
        return "Checking";
    }








}
