package com.alumniConnect.altEnter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alumniConnect.altEnter.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByEmail(String email);
}
