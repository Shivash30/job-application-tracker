package com.shivash.job_app_tracker.service;

import com.shivash.job_app_tracker.model.Job;
import com.shivash.job_app_tracker.repository.JobRepository;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public Job createJob(Job job){
        return jobRepository.save(job);
    }
}
