package com.ithouse.oauth2RegLgn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@RestController
@RequestMapping("/")
class PublicController {

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String user(Principal principal) {
        return principal.getName();
    }
}
