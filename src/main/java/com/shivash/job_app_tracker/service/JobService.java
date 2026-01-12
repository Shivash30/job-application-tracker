package com.shivash.job_app_tracker.service;

import com.shivash.job_app_tracker.dto.JobRequestDTO;
import com.shivash.job_app_tracker.model.Job;
import com.shivash.job_app_tracker.model.JobStatus;
import com.shivash.job_app_tracker.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public Job createJob(JobRequestDTO dto){
        Job job = new Job(
          dto.getCompany(),
          dto.getRole(),
          dto.getDateApplied(),
                JobStatus.valueOf(dto.getStatus()),
                dto.getNotes()
        );

        return jobRepository.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAllByOrderByDateAppliedDesc();
    }
}
