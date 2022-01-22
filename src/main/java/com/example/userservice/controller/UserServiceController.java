package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserServiceController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the User Service.";
    }
}
