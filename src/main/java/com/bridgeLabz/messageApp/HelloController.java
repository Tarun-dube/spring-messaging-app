package com.bridgeLabz.messageApp;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/hi")
@RestController()
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }
    @PutMapping("/put/{firstName}")
    public String hello(@PathVariable String firstName,@RequestParam String lastName) {
        return "First Name: "+firstName + " Last Name: " + lastName;
    }
}
