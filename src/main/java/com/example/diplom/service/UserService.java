package com.example.diplom.service;

import com.example.diplom.model.User;
import com.example.diplom.dto.UserDTO;
import com.example.diplom.dto.UserDtoMapper;
import com.example.diplom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDtoMapper userDtoMapper;
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public UserDTO getUserById(Integer id){
        return userRepository.findById(id).map(userDtoMapper).orElseThrow();
    }
}
