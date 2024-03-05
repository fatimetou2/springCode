package com.fati.employeeservice.mapper;

import com.fati.employeeservice.dto.EmployeeDto;
import com.fati.employeeservice.entity.Employee;

public class EmployeeMapper {
    //Convert User JPA Entity into UserDto
    public static EmployeeDto mapToEmployeeDto(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
        return employeeDto;
    }
    //convert Employee Dto to Employee Entity
    public static Employee mapToEmployee(EmployeeDto employeeDto){
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
        return employee;
    }
}
