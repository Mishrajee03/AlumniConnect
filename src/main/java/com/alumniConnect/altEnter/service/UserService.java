package com.alumniConnect.altEnter.service;

import com.alumniConnect.altEnter.model.User;
import com.alumniConnect.altEnter.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;
    public UserService(UserRepository repo) { this.repo = repo; }
    public List<User> getAllUsers() { return repo.findAll(); }
    public User save(User user) { return repo.save(user); }
}