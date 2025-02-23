package com.jobportal.job_portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.job_portal.repository.JobDataRepository;

@Service
public class JobService {
    
    @Autowired
    private JobDataRepository jobDataRepository;
    
}
