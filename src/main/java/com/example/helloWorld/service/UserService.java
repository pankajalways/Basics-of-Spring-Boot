package com.example.helloWorld.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getGreeting(String name){
        return "Welcome "+ name + " !";
    }
}
