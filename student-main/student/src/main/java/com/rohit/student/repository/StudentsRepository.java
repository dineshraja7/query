package com.rohit.student.repository;

import com.rohit.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Student, Integer> {
    List<Student> findByFirstName(String firstName);
   // List<Student> findByFacultyId(int facultyId);

    @Query(value = "Select st.student_id,st.first_name,st.last_name,st.age,st.class_year,sb.subject_name,fy.faculty_id,fy.first_name,fy.last_name,dp.department_name from student st inner join subject sb on st.faculty_id = sb.faculty_id inner join stu_subject ss on st.student_id = ss.student_id inner join faculty fy on st.faculty_id = fy.faculty_id inner join department dp on fy.department_id = dp.department_id",nativeQuery = true)
    List<Student>StudentFaculty();


}


