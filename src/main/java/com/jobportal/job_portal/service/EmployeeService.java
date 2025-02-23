package com.jobportal.job_portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.job_portal.repository.EmployeeDataRepository;

@Service
public class EmployeeService {
 
    @Autowired
    private EmployeeDataRepository employeeDataRepository;
}
