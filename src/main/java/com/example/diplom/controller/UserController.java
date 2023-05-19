package com.example.diplom.controller;

import com.example.diplom.dto.UserDTO;
import com.example.diplom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity getUsers(){
         return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public UserDTO getOneUser(@PathVariable Integer id){
        return userService.getUserById(id);
    }

}
