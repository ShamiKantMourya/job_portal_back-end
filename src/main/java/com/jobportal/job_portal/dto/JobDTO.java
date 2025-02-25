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

    public JobDTO() {
    }

    public JobDTO(Long jobId, String jobTitle, String jobDescription, String jobLocation, String jobType,
            String jobCategory,
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

    public Long getJobId() {
        return jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public String getJobType() {
        return jobType;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public String getCompanyImg() {
        return companyImg;
    }

    public double getSalary() {
        return salary;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public void setCompanyImg(String companyImg) {
        this.companyImg = companyImg;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
