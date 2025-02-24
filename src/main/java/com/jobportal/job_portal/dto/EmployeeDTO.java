package com.jobportal.job_portal.dto;

public class EmployeeDTO {
    private Long employeeId;
    private String name;
    private String email;
    private String phone;
    private String address;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long employeeId, String name, String email, String phone, String address) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
