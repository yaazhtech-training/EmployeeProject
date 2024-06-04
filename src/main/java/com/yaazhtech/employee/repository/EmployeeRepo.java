package com.yaazhtech.employee.repository;

import com.yaazhtech.employee.data.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeData,Long > {
}//method definition
