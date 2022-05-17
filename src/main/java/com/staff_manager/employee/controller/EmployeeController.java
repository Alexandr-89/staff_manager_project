package com.staff_manager.employee.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
