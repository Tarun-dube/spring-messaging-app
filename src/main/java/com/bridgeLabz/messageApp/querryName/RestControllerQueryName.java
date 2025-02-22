package com.bridgeLabz.messageApp.querryName;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/say")
@RestController
public class RestControllerQueryName {
    @GetMapping("/hello/query")
    public String hello(@RequestParam String name) {
        return "Hello "+name+" from BridgeLabz";
    }
}
