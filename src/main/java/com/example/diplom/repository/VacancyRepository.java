package com.example.diplom.repository;

import com.example.diplom.model.User;
import com.example.diplom.model.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VacancyRepository extends JpaRepository<Vacancy, Integer> {
}
