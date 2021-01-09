package com.rohit.student.controller;

import com.rohit.student.repository.FacultyRepository;
import com.rohit.student.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/info/faculty")


public class FacultyController {

    @Autowired
    FacultyRepository repository;

    @GetMapping("/name/{firstName}")
    String getFirstName(@PathVariable("firstName") final String name, Model model) {
        System.out.println("inside getFirstName method");
        model.addAttribute("faculties", repository.findByFirstName(name));
        return "index5";
    }

    @RequestMapping("/all")
    String getList(Model model){
        System.out.println("inside getList method");
        model.addAttribute("faculties",repository.FacultyDetails());
        return "index5";
    }
}
