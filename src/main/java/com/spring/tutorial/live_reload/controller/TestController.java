package com.spring.tutorial.live_reload.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String returnText(){
        return "Write anything in here to test the live reload";
    }
}
