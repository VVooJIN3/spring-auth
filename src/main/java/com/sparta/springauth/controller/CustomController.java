package com.sparta.springauth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomController {
    @GetMapping("/hello")

    public String hello() {
        return "hello";
    }
}
