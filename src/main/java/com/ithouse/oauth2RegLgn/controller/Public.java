package com.ithouse.oauth2RegLgn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
class Public {

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }
}
