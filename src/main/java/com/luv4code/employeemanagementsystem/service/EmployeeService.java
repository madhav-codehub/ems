package com.luv4code.employeemanagementsystem.service;

import com.luv4code.employeemanagementsystem.entity.Employee;
import com.luv4code.employeemanagementsystem.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        log.info("starting the service method");
        return employeeRepository.findAll();
    }

}
