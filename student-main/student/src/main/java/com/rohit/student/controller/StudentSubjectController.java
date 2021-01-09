package com.rohit.student.controller;


import com.rohit.student.repository.StudentSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/info/stusub")

public class StudentSubjectController{

    @Autowired
    StudentSubjectRepository repository;
    @GetMapping("/Id/{studentId}")
    String getFirstName(@PathVariable("studentId") final int studentId, Model model) {
        System.out.println("inside getFirstName method");
        //model.addAttribute("stu_subjects", repository.findByStudentId(studentId));
        return "index6";
    }

    @RequestMapping("/all")
    String getList(Model model){
        System.out.println("inside getList method");
        model.addAttribute("stu_subjects",repository.findAllDetails());
        return "index6";
    }

}
