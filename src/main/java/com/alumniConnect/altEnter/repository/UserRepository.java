package com.alumniConnect.altEnter.repository;

import com.alumniConnect.altEnter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
