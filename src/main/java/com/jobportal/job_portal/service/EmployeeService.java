package com.jobportal.job_portal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.job_portal.entity.Employee;
import com.jobportal.job_portal.repository.EmployeeDataRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDataRepository employeeDataRepository;

    public List<Employee> getAllEmployees() {
        return employeeDataRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        Optional<Employee> employee = employeeDataRepository.findById(id);
        if (employee.isEmpty()) {
            throw new RuntimeException("Employee not found");
        } else {
            return employee;
        }
    }

    public Employee creatEmployee(Employee employee) {
        return employeeDataRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeDataRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeDataRepository.deleteById(id);
    }
}
