package com.rohit.student.controller;
import com.rohit.student.model.Student;
import com.rohit.student.model.StudentInfo;
import com.rohit.student.model.Subject;
import com.rohit.student.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/info/studentDetails")
public class StudentDetailsController {

    @Autowired
    StudentDetailsRepository repository;

    @GetMapping("/details/{student_id}")
    String getList(@PathVariable("student_id") final int student_id ,Model model) {
       StudentInfo studentInfo = new StudentInfo();
        List<Student> studentDetailsList = repository.getStudentDetails(student_id);
        Student st = studentDetailsList.get(0);
        studentInfo.setStudentId(st.getStudentId());
        studentInfo.setFirstName(st.getFirstName());
        studentInfo.setLastName(st.getLastName());
        studentInfo.setAge(st.getAge());
        studentInfo.setClassYear(st.getClassYear());
        studentInfo.setSubjectName(st.getSubjectName());
        studentInfo.setSubjectId(st.getSubjectId());



        for (Student s:studentDetailsList){
            Subject sub= new Subject();
            sub.setSubjectName(s.getSubjectName());
            sub.setSubjectId(s.getSubjectId());
            studentInfo.getStuSubjects().add(sub);
        }
        model.addAttribute("studentInfo",studentInfo);
        System.out.println("inside getList method");
        //model.addAttribute("students", repository.getStudentDetails(student_id));
        return "StudentDetails";
    }
}
