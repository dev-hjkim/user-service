package com.example.userservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserServiceController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the User Service.";
    }

    @GetMapping("/message")
    public String message(@RequestHeader("user-request") String header) {
        log.info(header);
        return "Hello World in User Service.";
    }
}
