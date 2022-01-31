package com.sampleApplication.sample.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/customer")
@RestController
public class CustomerController {


    @GetMapping
    @PreAuthorize("hasAuthority('GET_USER')")
    public String hello(){
        return "Hello World";
    }


    @GetMapping(value = "/getdata")
    public String Test(){
        return "Checking";
    }








}
