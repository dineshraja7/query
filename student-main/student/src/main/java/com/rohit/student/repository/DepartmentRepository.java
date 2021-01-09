package com.rohit.student.repository;

import com.rohit.student.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    List<Department> findByDepartmentId(int departmentId);
    List<Department> findByDepartmentName(String departmentName);
    List<Department> findByDepartmentStrength(int departmentStrength );


  @Query(value = "Select dp.department_id,dp.department_name,dp.department_strength,dp.department_location,fy.first_name,fy.last_name,fy.subject_handling from department dp inner join faculty fy  on dp.department_id = fy.department_id",nativeQuery = true)
    List<Department> DepartmentDetails();
}




