package com.jobportal.job_portal.dto;

public class EmployerDTO {
    private Long employerId;
    private String companyName;
    private String email;
    private String phone;

    public EmployerDTO() {
    }

    public EmployerDTO(Long employerId, String companyName, String email, String phone) {
        this.employerId = employerId;
        this.companyName = companyName;
        this.email = email;
        this.phone = phone;
    }

    public Long getEmployerId() {
        return employerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmployerId(Long employerId) {
        this.employerId = employerId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
