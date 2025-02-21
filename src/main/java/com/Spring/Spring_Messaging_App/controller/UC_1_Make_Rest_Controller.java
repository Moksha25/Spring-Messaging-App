package com.Spring.Spring_Messaging_App.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  UC_1_Make_Rest_Controller{
    @RequestMapping("/")
    public String index() {
        return "Hello from BridgeLabz";
    }
}