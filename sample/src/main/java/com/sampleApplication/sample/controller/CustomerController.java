package com.sampleApplication.sample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController
public class CustomerController {


    @GetMapping
    public String hello(){
        return "Hello World";
    }


    @GetMapping(value = "/getdata")
    public String Test(){
        return "Checking";
    }








}
