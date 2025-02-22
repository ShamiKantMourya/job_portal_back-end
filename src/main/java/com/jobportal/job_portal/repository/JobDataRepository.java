package com.jobportal.job_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.job_portal.entity.Job;

import java.util.List;
import java.util.Optional;


public interface JobDataRepository extends JpaRepository<Job, Long>{
    Optional<Job> findById(Long id);
    List<Job> findByJobLocation(String jobLocation);
}