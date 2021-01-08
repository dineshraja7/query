package com.rohit.student.model;
import com.rohit.student.controller.StudentDetailsController;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;
@Data
public class StudentInfo {
    String firstName;
    String lastName;
    int studentId;
    int classYear;
    int subjectId;
    int age;
    String subjectName;


    List<Subject> stuSubjects = new ArrayList<>();


    public List<Subject> getStuSubjects() {
        return stuSubjects;
    }

    public void setStuSubjects(List<Subject> stuSubjects) {
        this.stuSubjects = stuSubjects;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


}
