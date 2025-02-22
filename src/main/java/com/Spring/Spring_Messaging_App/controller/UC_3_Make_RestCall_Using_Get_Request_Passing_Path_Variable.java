package com.Spring.Spring_Messaging_App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class UC_3_Make_RestCall_Using_Get_Request_Passing_Path_Variable {

    @GetMapping("/param/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}