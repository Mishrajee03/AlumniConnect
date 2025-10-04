package com.alumniConnect.altEnter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin-dashboard"; // will look for admin-dashboard.html
    }

    @GetMapping("/teacher/login")
    public String teacherLogin() {
        return "teacher-login"; // will look for teacher-login.html
    }

    @GetMapping("/student/login")
    public String studentLogin() {
        return "student-login"; // will look for student-login.html
    }

    @GetMapping("/alumni/login")
    public String alumniLogin() {
        return "alumni-login"; // will look for alumni-login.html
    }
}
