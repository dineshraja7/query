package com.rohit.student.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "student", catalog = "rrd")
public class Student {
    @Id int studentId;
    String firstName;

    String lastName;
    int age;
    int classYear;




   @Column(name = "subjectId")
   int subjectId;
    String subjectName;

//@Column(name="facultyFirstName")
  //  String facultyFirstName;
//@Column(name="facultyLastName")
  //  String facultyLastName;






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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    //public String getFacultyFirstName() {
      //  return facultyFirstName;
    //}

    //public void setFacultyFirstName(String facultyFirstName) {
     //   this.facultyFirstName =facultyFirstName;
    //}

    //public String getFacultyLastName() {
      //  return facultyLastName;
    //}

    //public void setFacultyLastName(String facultyLastName) {
      //  this.facultyLastName = facultyLastName;
    //}
}



