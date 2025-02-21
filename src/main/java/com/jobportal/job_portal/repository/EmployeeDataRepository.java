package com.jobportal.job_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.job_portal.entity.Employee;

public interface EmployeeDataRepository extends JpaRepository<Employee, Long> {
    Employee findByEmail(String email);
}