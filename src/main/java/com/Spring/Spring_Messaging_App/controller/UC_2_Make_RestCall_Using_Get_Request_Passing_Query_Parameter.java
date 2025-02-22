package com.Spring.Spring_Messaging_App.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class UC_2_Make_RestCall_Using_Get_Request_Passing_Query_Parameter {

    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam("name") String name){
        return "Hello " + name + " from BridgeLabz";
    }
}