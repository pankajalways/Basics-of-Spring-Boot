package com.example.helloWorld.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController{

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/greet")
    public String greetUser(@RequestParam String name){
        return "Hello, " + name + " !";
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String message){
        return "You said " + message + " !";
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id){
        return "User with ID " + id;
    }



}