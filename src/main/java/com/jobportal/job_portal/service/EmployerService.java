package com.jobportal.job_portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.job_portal.repository.EmployerDataRepository;

@Service
public class EmployerService{

    @Autowired
    private EmployerDataRepository employerDataRepository;
    
}