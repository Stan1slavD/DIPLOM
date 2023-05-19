package com.example.diplom.controller;

import com.example.diplom.dto.EmployerDTO;
import com.example.diplom.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employers")
public class EmployerController {

    @Autowired
    EmployerService employerService;

    @GetMapping
    public List<EmployerDTO> getEmployers(){
        return employerService.getAllEmployers();
    }

    @GetMapping("/{id}")
    public EmployerDTO getOneEmployer(@PathVariable Integer id){
        return employerService.getEmployerById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployer(@PathVariable Integer id){
        employerService.deleteEmployerByID(id);
    }


//    @GetMapping("/{id}")
//    public ResponseEntity getOneUser(@PathVariable Integer id){
//        return ResponseEntity.ok(userService.getUserById(id));
//    }
//
//    @GetMapping("/{id}")
//    public UserDTO getOneUser(@PathVariable Integer id){
//        return userService.getUserById(id);
//    }

}
