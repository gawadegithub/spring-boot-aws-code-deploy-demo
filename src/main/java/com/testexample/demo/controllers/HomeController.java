package com.testexample.demo.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public HttpEntity<String> apiUp(){
        return ResponseEntity.ok("hello world");
    }
}

