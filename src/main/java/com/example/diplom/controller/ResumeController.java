package com.example.diplom.controller;

import com.example.diplom.dto.EmployerDTO;
import com.example.diplom.model.Resume;
import com.example.diplom.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resumes")
public class ResumeController {

    @Autowired
    ResumeService resumeService;

    @GetMapping
    public List<Resume> getResumes(){
        return resumeService.getAllResumes();
    }

    @GetMapping("/{id}")
    public Resume getOneEmployer(@PathVariable Integer id){
        return resumeService.getResumeById(id);
    }

}
