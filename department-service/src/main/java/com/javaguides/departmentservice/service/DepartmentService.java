package com.javaguides.departmentservice.service;

import com.javaguides.departmentservice.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);
    DepartmentDto getDepartmentById(Long departmentId);
    DepartmentDto getDepartmentByCode(String departmentCode);

}
