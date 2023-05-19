package com.example.diplom.repository;

import com.example.diplom.model.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ResumeRepository extends JpaRepository<Resume, Integer> {
}
