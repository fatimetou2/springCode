package com.fati.employeeservice.service.ServiceImp;

import com.fati.employeeservice.dto.EmployeeDto;
import com.fati.employeeservice.entity.Employee;
import com.fati.employeeservice.exception.ResourceNotFoundException;
import com.fati.employeeservice.mapper.EmployeeMapper;
import com.fati.employeeservice.repository.EmployeeRepository;
import com.fati.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
   private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(savedEmployee);
        return savedEmployeeDto;
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                ()->new ResourceNotFoundException("Employee","id",employeeId)
        );
        EmployeeDto employeeDto =  EmployeeMapper.mapToEmployeeDto(employee);
        return employeeDto;
    }
}
