package com.satendra.helloservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("hello")
    public String helloPrint(){

        return "hello from "+port;
    }


}
