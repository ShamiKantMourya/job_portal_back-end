package com.jobportal.job_portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.job_portal.entity.Job;
import com.jobportal.job_portal.repository.JobDataRepository;

@Service
public class JobService {
    
    @Autowired
    private JobDataRepository jobDataRepository;
    
    public Job createJob(Job job){
        return jobDataRepository.save(job);
    }

    public Job getJobById(Long id){
        return jobDataRepository.findById(id).get();
    }

    public Job updateJob(Job job){
        return jobDataRepository.save(job);
    }

    public void deleteJob(Long id){
        jobDataRepository.deleteById(id);
    }

    public Iterable<Job> getAllJobs(){
        return jobDataRepository.findAll();
    }
}
