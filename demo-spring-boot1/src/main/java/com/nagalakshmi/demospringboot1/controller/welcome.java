package com.nagalakshmi.demospringboot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class welcome {
    @GetMapping("/welcome")
    public String method() {
        return "hello Naga lakshmi";
    }


}
