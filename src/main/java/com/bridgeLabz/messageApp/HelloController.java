package com.bridgeLabz.message;
import com.bridgeLabz.messageApp.Entity.Person;
import org.springframework.web.bind.annotation
import org.springframework.web.bind.annotation.*;

@RequestMapping("/hi")

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControlle
@RestController()
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from BridgeLabz";
    }

    @PutMapping("/put/{firstName}")
    public String hello(@PathVariable String firstName,@RequestParam String lastName) {
        return "First Name: "+firstName + " Last Name: " + lastName;



    @PostMapping("/hello/post")
    public String helloPost(@RequestBody Person person) {
        return "FirstName: " + person.getFirstName() + " LastName: " + person.getLastName();
    }


    @GetMapping("/hello/param/{name}")
    public String helloParam(@PathVariable String name) {
        return "Hello "+name+" from BridgeLabz ";

    }
}
