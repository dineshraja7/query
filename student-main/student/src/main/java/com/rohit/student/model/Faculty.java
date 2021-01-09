package com.rohit.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "faculty", catalog = "rrd")
public class Faculty {
    @Id
    int facultyId;
    String firstName;
    String lastName;
    int age;
    String subjectHandling;
    float basicPay;
    Date startDate;
    int departmentId;

    String departmentName;

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
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

    public void setLastName(int lastname) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubjectHandling() {
        return subjectHandling;
    }

    public void setSubjectHandling(String subjectHandling) {
        this.subjectHandling = subjectHandling;
    }

    public float getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(float basicPay) {
        this.basicPay = basicPay;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
