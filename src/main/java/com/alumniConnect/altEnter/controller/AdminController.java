package com.alumniConnect.altEnter.controller;

import com.alumniConnect.altEnter.model.Admin;
import com.alumniConnect.altEnter.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;

    @PostMapping("/admin/login")
    public ModelAndView login(@RequestParam String email, @RequestParam String password) {
        ModelAndView mv = new ModelAndView();

        Admin admin = adminRepository.findByEmail(email);

        if (admin != null && admin.getPassword().equals(password)) {
            mv.setViewName("admin-dashboard"); // dashboard.html
            mv.addObject("admin", admin);
        } else {
            mv.setViewName("admin-login"); // login.html
            mv.addObject("error", "Invalid email or password!");
        }
        return mv;
    }
}
