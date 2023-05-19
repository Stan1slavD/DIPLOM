package com.example.diplom.service;

import com.example.diplom.dto.UserDTO;
import com.example.diplom.dto.UserDtoMapper;
import com.example.diplom.model.Resume;
import com.example.diplom.model.User;
import com.example.diplom.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {

    @Autowired
    ResumeRepository resumeRepository;

//    @Autowired
//    private UserDtoMapper userDtoMapper;
    public List<Resume> getAllResumes(){
        return resumeRepository.findAll();
    }

    public Resume getResumeById(Integer id){
        return resumeRepository.findById(id).orElseThrow();//.map(userDtoMapper).orElseThrow();
    }
}
