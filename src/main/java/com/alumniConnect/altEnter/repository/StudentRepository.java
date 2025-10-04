package com.alumniConnect.altEnter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alumniConnect.altEnter.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
}
