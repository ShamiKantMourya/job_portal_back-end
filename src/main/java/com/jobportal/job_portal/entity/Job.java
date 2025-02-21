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
    public String jobStatus;
    public String companyImg;

    public Job() {

    }

    public Job(String jobTitle, String jobDescription, String jobLocation, String jobType, String jobCategory,
            String jobStatus, String companyImg) {
        super();
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobLocation = jobLocation;
        this.jobType = jobType;
        this.jobCategory = jobCategory;
        this.jobStatus = jobStatus;
        this.companyImg = companyImg;

    }

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
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

    public String toString() {
        return "Job [id=" + id + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription + ", jobLocation="
                + jobLocation + ", jobType=" + jobType + ", jobCategory=" + jobCategory + ", jobStatus=" + jobStatus
                + ", companyImg=" + companyImg + "]";
    }

}
