package com.example.diplom.service;

import com.example.diplom.dto.EmployerDTO;
import com.example.diplom.dto.EmployerDtoMapper;
import com.example.diplom.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployerService {

    @Autowired
    EmployerRepository employerRepository;

    @Autowired
    EmployerDtoMapper employerDtoMapper;

    public List<EmployerDTO> getAllEmployers() {
        return employerRepository.findAll().stream().map(employerDtoMapper).collect(Collectors.toList());
    }

    public EmployerDTO getEmployerById(Integer id) {
        return employerRepository.findById(id).map(employerDtoMapper).orElseThrow();
    }

    public void deleteEmployerByID(Integer id) {
        employerRepository.deleteById(id);
    }


}
