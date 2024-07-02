package ru.kk.dock_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheController {
    @GetMapping("/")
    public String hello(){
        return "Hello Docker!";
    }
}
