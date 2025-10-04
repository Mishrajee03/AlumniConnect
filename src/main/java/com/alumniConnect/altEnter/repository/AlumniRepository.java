package com.alumniConnect.altEnter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alumniConnect.altEnter.model.Alumni;

public interface AlumniRepository extends JpaRepository<Alumni, Long> {
    Alumni findByEmail(String email);
}
