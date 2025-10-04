package com.alumniConnect.altEnter.controller;

import com.alumniConnect.altEnter.model.Student;
import com.alumniConnect.altEnter.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student/login")
    public ModelAndView login(@RequestParam String email, @RequestParam String password) {
        ModelAndView mv = new ModelAndView();

        Student student = studentRepository.findByEmail(email);

        if (student != null && student.getPassword().equals(password)) {
            mv.setViewName("student-dashboard"); // dashboard.html
            mv.addObject("student", student);
        } else {
            mv.setViewName("student-login"); // login.html
            mv.addObject("error", "Invalid email or password!");
        }
        return mv;
    }
}
