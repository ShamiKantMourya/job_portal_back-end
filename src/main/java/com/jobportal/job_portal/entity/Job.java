package com.jobportal.job_portal.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String jobTitle;
    public String jobDescription;
    public String jobLocation;
    public String jobType;
    public String jobCategory;
    public String jobQualification;
    public String jobExperience;
    public String jobSalary;

    public Job() {

    }

    public Job(String jobTitle, String jobDescription, String jobLocation, String jobType, String jobCategory,
            String jobQualification, String jobExperience, String jobSalary) {
        super();
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobLocation = jobLocation;
        this.jobType = jobType;
        this.jobCategory = jobCategory;
        this.jobQualification = jobQualification;
        this.jobExperience = jobExperience;
        this.jobSalary = jobSalary;
    }
}
