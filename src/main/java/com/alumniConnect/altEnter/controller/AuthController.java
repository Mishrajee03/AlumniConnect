package com.alumniConnect.altEnter.controller;

import com.alumniConnect.altEnter.model.User;
import com.alumniConnect.altEnter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";  // register.html
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            return "redirect:/register?error=emailExists";
        }

        // Save with encoded password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        return "redirect:/login?success";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // login.html
    }
}
