package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hello")
    public String HelloTest(Model model)
    {
        model.addAttribute("username", "hello leehyuk" );
        return "greetings";
    }
    @GetMapping("/goodbye")
    public String bye(Model model)
    {
        model.addAttribute( "nickname", "maru papa");
        return "goodbye";
    }
}
