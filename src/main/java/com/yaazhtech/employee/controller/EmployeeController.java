package com.yaazhtech.employee.controller;

import com.yaazhtech.employee.data.EmployeeData;
import com.yaazhtech.employee.model.EmployeeInfo;
import com.yaazhtech.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.List;

@RestController
@RequestMapping("/demo/employee")

public class EmployeeController implements EmployeeManagement {
    @Autowired//method declaration
    EmployeeRepo employeeRepo;
    @Override
    public String saveEmployeeData(EmployeeInfo employeeInfo){//method implementation
        EmployeeData employeeData=new EmployeeData();
        employeeData.setEmployeeName(employeeInfo.getEmployeeName());
        employeeData.setEmailId(employeeInfo.getEmailId());
        employeeData.setSalary(employeeInfo.getSalary());
        employeeData.setPanNum(employeeInfo.getPanNum());
        employeeData.setMobilNum(employeeInfo.getMobilNum());
        employeeData.setAddress(employeeInfo.getAddress());
        employeeRepo.save(employeeData);
        return "Employee Data saved successfully";

}
    @Override
    public List<EmployeeData> getAllEmployee() {
        return List.of();
    }

    @Override
    public EmployeeData getEmployeeId(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteEmployeeId(Long id) {
        employeeRepo.deleteById(id);

    }


    @Override
    public EmployeeData updateEmployee(Long id, EmployeeData updateEmployee) {

        EmployeeData existingEmployee=employeeRepo.findById(id).orElse(null);
        if(existingEmployee!=null)
        {
            existingEmployee.setPanNum(updateEmployee.getPanNum());
        }

        return employeeRepo.save(existingEmployee);
    }

}
