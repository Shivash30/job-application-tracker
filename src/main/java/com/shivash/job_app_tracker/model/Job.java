package com.shivash.job_app_tracker.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String company;
    String role;
    LocalDateTime dateApplied;
    @Enumerated(EnumType.STRING)
    Status status;
    String notes;
}
