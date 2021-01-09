package com.rohit.student.repository;

import com.rohit.student.model.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentSubjectRepository extends JpaRepository<StudentSubject, Integer> {
    List<StudentSubject> findBySubjectId(int subjectId);




    @Query(value = "Select ss.stu_sub_id,sb.subject_name,st.first_name,st.student_id,sb.subject_id  from stu_subject  ss inner join student  st on st.student_id = ss.student_id inner join subject  sb on ss.subject_id = sb.subject_id order by st.first_name",nativeQuery = true)
    List<StudentSubject>findAllDetails();





}