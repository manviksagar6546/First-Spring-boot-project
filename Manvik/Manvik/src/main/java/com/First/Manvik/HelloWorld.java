package com.First.Manvik;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping
    public String Hello(){
        return "Hello my Dream world - Manvik sagar again respart his Career";
    }
}
