package com.Spring.Spring_Messaging_App.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class UC_5_Put_Request{
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName){
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}