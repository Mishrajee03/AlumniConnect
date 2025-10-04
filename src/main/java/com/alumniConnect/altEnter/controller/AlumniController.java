package com.alumniConnect.altEnter.controller;

import com.alumniConnect.altEnter.model.Alumni;
import com.alumniConnect.altEnter.repository.AlumniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlumniController {

    @Autowired
    private AlumniRepository alumniRepository;

    @PostMapping("/alumni/login")
    public ModelAndView login(@RequestParam String email, @RequestParam String password) {
        ModelAndView mv = new ModelAndView();

        Alumni alumni = alumniRepository.findByEmail(email);

        if (alumni != null && alumni.getPassword().equals(password)) {
            mv.setViewName("alumni-dashboard"); // dashboard.html
            mv.addObject("alumni", alumni);
        } else {
            mv.setViewName("alumni-login"); // login.html
            mv.addObject("error", "Invalid email or password!");
        }
        return mv;
    }
}
