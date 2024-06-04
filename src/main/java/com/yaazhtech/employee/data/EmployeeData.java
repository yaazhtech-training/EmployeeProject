package com.yaazhtech.employee.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employeeData")
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",nullable=false)
    private Long id;//method definition
    private String employeeName;
    private String emailId;
    private String salary;
    private String panNum;
    private String mobilNum;
    private String address;
}
