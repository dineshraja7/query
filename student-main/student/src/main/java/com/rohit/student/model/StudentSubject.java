package com.rohit.student.model;
import javax.persistence.*;

@Entity
@Table(name = "stu_subject", catalog = "rrd")

public class StudentSubject {

    @Id int stuSubId;
    int subjectId;
    int studentId;

    String firstName;
    String subjectName;


    public int getStuSubId() {
        return stuSubId;
    }

    public void setStuSubId(int stuSubId) {
        this.stuSubId = stuSubId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
