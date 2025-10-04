package com.alumniConnect.altEnter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alumniConnect.altEnter.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Teacher findByEmail(String email);
}
