package com.luv4code.employeemanagementsystem.controller;

import com.luv4code.employeemanagementsystem.entity.Employee;
import com.luv4code.employeemanagementsystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployeeList(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(employeeService.getAllEmployees());
    }

}
