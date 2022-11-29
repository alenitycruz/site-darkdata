package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class MenuController {

    @GetMapping
    public ModelAndView principal() {
        ModelAndView mv = new ModelAndView("index.html");

        return mv;
    }

    @RequestMapping(path = "conceito")
    public ModelAndView oquee() {
        ModelAndView mv = new ModelAndView("oquee.html");

        return mv;
    }
    
}