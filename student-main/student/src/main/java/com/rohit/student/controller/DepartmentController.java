package com.rohit.student.controller;

import com.rohit.student.model.Department;
import com.rohit.student.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/info/department")

public class DepartmentController {
    @Autowired
    DepartmentRepository repository;
    @GetMapping("/name/{departmentName}")

    String getDepartment(@PathVariable("departmentName") final String name, Model model){
        System.out.println("inside getDepartment method");
        model.addAttribute("departments", repository.findByDepartmentName(name));
        return "index3";

    }
    @RequestMapping("/all")
    String getList(Model model){
        System.out.println("inside getList method");
        model.addAttribute("departments",repository.DepartmentDetails());
        return "index3";
    }

    }





