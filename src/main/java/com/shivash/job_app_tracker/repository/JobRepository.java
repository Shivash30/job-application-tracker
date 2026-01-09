package com.shivash.job_app_tracker.repository;

import com.shivash.job_app_tracker.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findAllByOrderByDateAppliedDesc();
}
