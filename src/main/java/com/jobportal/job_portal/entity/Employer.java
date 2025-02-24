package com.jobportal.job_portal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employerId;

    private String companyName;
    private String email;
    private String password;
    
    public Employer() {

    }

    public Employer(String companyName, String email, String password) {
        super();
        this.companyName = companyName;
        this.email = email;
        this.password = password;
    }

    public Long getEmployerId() {
        return employerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmployerId(Long id) {
        this.employerId = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Employer [id=" + employerId + ", companyName=" + companyName + ", email=" + email + ", password="
                + password
                + "]";
    }

}
