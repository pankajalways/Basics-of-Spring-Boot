package com.example.helloWorld.controller;

import com.example.helloWorld.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.helloWorld.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //save a new user (POST /users)
    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity user){
        return userRepository.save(user);
    }

    //get all users (GET / users)
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    //get user by id (GET /users/{id})
    @GetMapping("/{id}")
    public UserEntity getUserById(@PathVariable long id){
        return userRepository.findById(id).orElse(null);
    }

}
