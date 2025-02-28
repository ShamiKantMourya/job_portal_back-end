package com.jobportal.job_portal.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.job_portal.service.EmployerService;
import com.jobportal.job_portal.entity.Employer;

@RestController
@RequestMapping("/api/v1/employer")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @GetMapping("/allEmployers")
    public Iterable<Employer> getAllEmployers() {
        return employerService.getAllEmployers();
    }

    @GetMapping("/{id}")
    public Optional<Employer> getEmployerById(Long id) {
        return employerService.getEmployerById(id);
    }

    @PostMapping("/createEmployer")
    public Employer createEmployer(@RequestBody Employer employer) {
        return employerService.createEmployer(employer);
    }

    @PostMapping("/updateEmployer/{id}")
    public Employer updateEmployer(@PathVariable  Long id, @RequestBody Employer employer) {
        return employerService.updateEmployer(employer);
    }

    @DeleteMapping("/deleteEmployer/{id}")
    public void deleteEmployer(@PathVariable Long id) {
        employerService.deleteEmployer(id);
    }
}
