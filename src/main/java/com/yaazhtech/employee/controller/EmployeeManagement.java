package com.yaazhtech.employee.controller;

import com.yaazhtech.employee.data.EmployeeData;
import com.yaazhtech.employee.model.EmployeeInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface EmployeeManagement {
    @PostMapping("/save")
    public String saveEmployeeData(@RequestBody EmployeeInfo employeeInfo);//method declaration
    @GetMapping("/getAllEmployee")
    public List<EmployeeData> getAllEmployee();
    @GetMapping("/{id}")
    public EmployeeData getEmployeeId(@PathVariable Long id);
    @DeleteMapping("/{id}")
    public  void deleteEmployeeId(@PathVariable Long id );
    @PutMapping("/{id}")
    public EmployeeData updateEmployee(@PathVariable Long id, @RequestBody EmployeeData updateEmployee);
}
