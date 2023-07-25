package com.javaguides.employeeservice.service;

import com.javaguides.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeByID(Long id);
}
