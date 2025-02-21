package com.jobportal.job_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.job_portal.entity.Employer;

public interface EmployerDataRepository extends JpaRepository<Employer, Long> {
    Employer findByEmail(String email);
}
