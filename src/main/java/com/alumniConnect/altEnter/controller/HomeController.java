package com.alumniConnect.altEnter.controller; // replace with your base package

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/events")
    public String events() {
        return "events";
    }

    @GetMapping("/jobs")
    public String jobs() {
        return "jobs";
    }

    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }



}
