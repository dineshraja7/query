package com.rohit.student.repository;
import com.rohit.student.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentDetailsRepository extends JpaRepository<Student, Integer> {

    @Query(value = "Select st.student_id,st.first_name,st.last_name,st.age,st.class_year,sb.subject_id,sb.subject_name from  student st inner join stu_subject ss on st.student_id = ss.student_id inner join subject sb on sb.subject_id = ss.subject_id where st.student_id = :student_id group by ss.subject_id,ss.student_id",nativeQuery = true)
    List<Student> getStudentDetails(int student_id);
}
