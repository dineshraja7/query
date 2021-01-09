package com.rohit.student.repository;
import com.rohit.student.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    List<Subject> findBySubjectId(int subjectId);
    List<Subject> findBySubjectName(String subjectName);


    @Query(value = "Select sb.subject_id,sb.subject_name,sb.faculty_id,fy.first_name,fy.last_name from faculty fy inner join subject sb  on fy.faculty_id = sb.faculty_id",nativeQuery = true)
    List<Subject> SubjectDetails();


}

