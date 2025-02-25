package com.jobportal.job_portal.dto;

public class JobDTO {
    private Long jobId;

    private String jobTitle;
    private String jobDescription;
    private String jobLocation;
    private String jobType;
    private String jobCategory;
    private String jobStatus;
    private String companyImg;
    private double salary;

    public JobDTO() {}

    public JobDTO(Long jobId, String jobTitle, String jobDescription, String jobLocation, String jobType, String jobCategory,
            String jobStatus, String companyImg, double salary) {
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobLocation = jobLocation;
        this.jobType = jobType;
        this.jobCategory = jobCategory;
        this.jobStatus = jobStatus;
        this.companyImg = companyImg;
        this.salary = salary;
    }

    
}
