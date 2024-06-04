package com.yaazhtech.employee.model;

import lombok.Data;

@Data
public class EmployeeInfo {
    private  Long id;
    private  String employeeName;
    private  String emailId;
    private  String salary;
    private String panNum;
    private String mobilNum;
    private String address;
}
