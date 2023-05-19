package com.example.diplom.service;

import com.example.diplom.dto.UserDTO;
import com.example.diplom.dto.UserDtoMapper;
import com.example.diplom.model.User;
import com.example.diplom.model.Vacancy;
import com.example.diplom.repository.UserRepository;
import com.example.diplom.repository.VacancyRepository;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyService {
    @Autowired
    private VacancyRepository vacancyRepository;

//    @Autowired
//    private UserDtoMapper userDtoMapper;
    public List<Vacancy> getAllVacancies(){
        return vacancyRepository.findAll();
    }


    public Vacancy getVacancyById(Integer id){
        return vacancyRepository.findById(id).orElseThrow();//.map(userDtoMapper).orElseThrow();
    }
}
