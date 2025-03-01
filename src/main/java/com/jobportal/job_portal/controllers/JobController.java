package com.jobportal.job_portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.job_portal.entity.Job;
import com.jobportal.job_portal.service.JobService;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    
    @Autowired
    private JobService jobService;

    @GetMapping("/allJobs")
    public Iterable<Job> getAllJobs() {
        return jobService.getAllJobs();
    }
    @GetMapping("/job")
    public Job getJobById(Long id) {
        return jobService.getJobById(id);
    }
  
    @PostMapping("/createJob")
    public Job createJob(Job job) {
        return jobService.createJob(job);
    }
}
