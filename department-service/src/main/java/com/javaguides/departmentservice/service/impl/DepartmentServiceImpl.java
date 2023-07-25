package com.javaguides.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import com.javaguides.departmentservice.dto.DepartmentDto;
import com.javaguides.departmentservice.entity.Department;
import com.javaguides.departmentservice.mapper.AutoDepartmentMapper;
import com.javaguides.departmentservice.repository.DepartmentRepository;
import com.javaguides.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        //convert department dto to department JPA entity.
        Department department = AutoDepartmentMapper.MAPPER.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(savedDepartment);
    }


    @Override
    public DepartmentDto getDepartmentById(Long departmentId) {
        DepartmentDto departmentDto = AutoDepartmentMapper.MAPPER.mapToDepartmentDto( departmentRepository.getReferenceById(departmentId));
        return departmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        //Get DepartmentDto to DepartmentJPA
        Department department = departmentRepository.findByDepartmentCode(departmentCode);
        DepartmentDto departmentDto = AutoDepartmentMapper.MAPPER.mapToDepartmentDto(department);
        return departmentDto;
    }
}
