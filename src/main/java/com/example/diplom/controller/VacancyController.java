package com.example.diplom.controller;

import com.example.diplom.model.Vacancy;
import com.example.diplom.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vacancies")
public class VacancyController {

    @Autowired
    VacancyService vacancyService;

    @GetMapping
    public List<Vacancy> getVacancies() {
        return vacancyService.getAllVacancies();
    }

    @GetMapping("/{id}")
    public Vacancy getOneVacancy(@PathVariable Integer id) {
        return vacancyService.getVacancyById(id);
    }

}
