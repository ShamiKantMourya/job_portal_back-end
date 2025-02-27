package com.jobportal.job_portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jobportal.job_portal.service.EmployerService;
import com.jobportal.job_portal.entity.Employer;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {
    
    @Autowired
    private EmployerService employerService;

    @GetMapping("/allEmployers")
    public Iterable<Employer> getAllEmployers() {
        return employerService.getAllEmployers();
    }
}
