package com.luv4code.ems.service;

import com.luv4code.ems.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public Employee createEmployee(Employee employee) {
        employees.add(employee);

        return employees.stream()
                .filter(e -> e.getId().equals(employee.getId()))
                .findFirst().get();
    }

    public Employee getEmployee(Integer id){
        return employees.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .get();
    }

    public List<Employee> getAllEmployees(){
        return employees;
    }
}
