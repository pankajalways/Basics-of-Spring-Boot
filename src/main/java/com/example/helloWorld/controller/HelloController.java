package com.example.helloWorld.controller;

import com.example.helloWorld.service.UserService;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
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
        return "User with ID"  + id;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return user;
        //returns JSON back
    }

    @Autowired
    private UserService userService;

    @GetMapping("/welcome")
    public String welcome(@RequestParam String name){
        return userService.getGreeting(name);
    }

}