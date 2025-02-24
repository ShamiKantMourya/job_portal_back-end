package com.jobportal.job_portal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;

    public String jobTitle;
    public String jobDescription;
    public String jobLocation;
    public String jobType;
    public String jobCategory;
    public String jobStatus;
    public String companyImg;
    private double salary;

    @ManyToOne
    @JoinColumn(name = "employerId")
    private Employer employer;

    public Job() {

    }

    public Job(String jobTitle, String jobDescription, String jobLocation, String jobType, String jobCategory,
            String jobStatus, String companyImg, double salary, Employer employer) {
        super();
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobLocation = jobLocation;
        this.jobType = jobType;
        this.jobCategory = jobCategory;
        this.jobStatus = jobStatus;
        this.companyImg = companyImg;
        this.salary = salary;
        this.employer = employer;
    }

    public Long getId() {
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

    public Employer getEmployer() {
        return employer;
    }

    public void setId(Long id) {
        this.jobId = id;
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

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String toString() {
        return "Job [id=" + jobId + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription + ", jobLocation="
                + jobLocation + ", jobType=" + jobType + ", jobCategory=" + jobCategory + ", jobStatus=" + jobStatus
                + ", companyImg=" + companyImg + " , salary=" + salary + " , employer=" + employer + "]";
    }

}
