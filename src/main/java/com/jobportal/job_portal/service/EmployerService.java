package com.jobportal.job_portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.job_portal.entity.Employer;
import com.jobportal.job_portal.repository.EmployerDataRepository;

@Service
public class EmployerService{

    @Autowired
    private EmployerDataRepository employerDataRepository;
    
    public Employer saveEmployer(Employer employer) {
        return employerDataRepository.save(employer);
    }

    public void deleteEmployer(Long id) {
        employerDataRepository.deleteById(id);
    }
    
}