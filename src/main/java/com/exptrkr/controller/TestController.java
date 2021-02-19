package com.exptrkr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getmsg")
    public String getMsg(){
        return "Welcome to the Expense Tracker App!!!";
    }
}
