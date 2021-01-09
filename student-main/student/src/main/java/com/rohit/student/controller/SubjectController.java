package com.rohit.student.controller;


import com.rohit.student.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/info/subject")

public class SubjectController {
    @Autowired
    SubjectRepository repository;

    @GetMapping("/name/{subjectName}")
    String getSubject(@PathVariable("subjectName") final String name, Model model) {
        System.out.println("inside getSubject method");
        model.addAttribute("subjects", repository.findBySubjectName(name));
        return "index4";
    }

    @RequestMapping("/all")
    String getList(Model model){
        System.out.println("inside getList method");
        model.addAttribute("subjects",repository.SubjectDetails());
        return "index4";
    }



}
