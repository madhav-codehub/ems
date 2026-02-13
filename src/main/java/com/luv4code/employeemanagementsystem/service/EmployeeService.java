package com.luv4code.employeemanagementsystem.service;

import com.luv4code.employeemanagementsystem.entity.Employee;
import com.luv4code.employeemanagementsystem.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

}
