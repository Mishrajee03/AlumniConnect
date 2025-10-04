package com.alumniConnect.altEnter.controller;

import com.alumniConnect.altEnter.model.User;
import com.alumniConnect.altEnter.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service) { this.service = service; }

    @GetMapping
    public List<User> getUsers() { return service.getAllUsers(); }

    @PostMapping
    public User addUser(@RequestBody User user) { return service.save(user); }
}