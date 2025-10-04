package com.alumniConnect.altEnter.controller;

import com.alumniConnect.altEnter.model.Teacher;
import com.alumniConnect.altEnter.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @PostMapping("/teacher/login")
    public ModelAndView login(@RequestParam String email, @RequestParam String password) {
        ModelAndView mv = new ModelAndView();

        Teacher teacher = teacherRepository.findByEmail(email);

        if (teacher != null && teacher.getPassword().equals(password)) {
            mv.setViewName("teacher-dashboard"); // dashboard.html
            mv.addObject("teacher", teacher);
        } else {
            mv.setViewName("teacher-login"); // login.html
            mv.addObject("error", "Invalid email or password!");
        }
        return mv;
    }
}
