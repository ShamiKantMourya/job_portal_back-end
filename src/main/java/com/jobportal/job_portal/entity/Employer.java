package com.jobportal.job_portal.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Employer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public String companyName;
    public String email;
    public String password;

    public Employer(){

    }

    public Employer(String companyName, String email, String password) {
        super();
        this.companyName = companyName;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
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


}
