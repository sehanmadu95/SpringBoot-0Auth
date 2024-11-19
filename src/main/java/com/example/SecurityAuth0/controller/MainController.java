package com.example.SecurityAuth0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String getWelcome(){
        return "Hello Welcome to O'Auth login...";
    }
}
