package com.jobportal.job_portal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.job_portal.entity.Employer;
import com.jobportal.job_portal.repository.EmployerDataRepository;

@Service
public class EmployerService {

    @Autowired
    private EmployerDataRepository employerDataRepository;

    public Iterable<Employer> getAllEmployers() {
        return employerDataRepository.findAll();
    }

    public Employer createEmployer(Employer employer) {
        return employerDataRepository.save(employer);
    }

    public void deleteEmployer(Long id) {
        employerDataRepository.deleteById(id);
    }

    public Optional<Employer> getEmployerById(Long id) {
        Optional<Employer> employer = employerDataRepository.findById(id);
        if (employer.isEmpty()) {
            throw new RuntimeException("Employer not found");
        } else {
            return employer;
        }
    }

    public Employer updateEmployer(Employer employer) {
        return employerDataRepository.save(employer);
    }
}