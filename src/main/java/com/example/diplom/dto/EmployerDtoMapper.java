package com.example.diplom.dto;

import com.example.diplom.model.Employer;
import org.springframework.stereotype.Service;

import java.util.function.Function;


    @Service
    public class EmployerDtoMapper implements Function<Employer, EmployerDTO> {
        @Override
        public EmployerDTO apply(Employer employer) {
            return new EmployerDTO(
                    employer.getId(),
                    employer.getName()
            );
        }
    }


