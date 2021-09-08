package com.example.lienhespring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class lienheController {

    @GetMapping(value = "/home")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @GetMapping(value = "/ds-lien-he")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("danhsach");
        return mv;
    }
}
