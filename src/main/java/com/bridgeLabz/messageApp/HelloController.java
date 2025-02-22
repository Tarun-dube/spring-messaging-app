package com.bridgeLabz.messageApp;

import com.bridgeLabz.messageApp.Entity.Person;
import org.springframework.web.bind.annotation.*;


@RestController()
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    @PostMapping("/hello/post")
    public String helloPost(@RequestBody Person person) {
        return "FirstName: " + person.getFirstName() + " LastName: " + person.getLastName();
    }

}
