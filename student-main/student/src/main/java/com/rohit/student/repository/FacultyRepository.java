package com.rohit.student.repository;

import com.rohit.student.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Date;
import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
    List<Faculty> findByFacultyId(int facultyId);
    List<Faculty> findByFirstName(String firstName);
    List<Faculty> findByLastName(String lastName );
    List<Faculty> findByAge(int age );
    List<Faculty> findBySubjectHandling(String subjectHandling );
    List<Faculty> findByBasicPay(float basicPay );
    List<Faculty> findByStartDate(Date startDate );
    List<Faculty> findByDepartmentId(int departmentId );


  @Query(value = "Select fy.faculty_id,fy.first_name,fy.last_name,fy.age,fy.subject_handling,fy.basic_pay,fy.start_date,fy.department_id,dp.department_name from faculty fy inner join department dp on fy.department_id = dp.department_id",nativeQuery = true)
    List<Faculty>FacultyDetails();

}

