package com.shivash.job_app_tracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    String company;

    @Column(nullable = false)
    String role;

    @Column(nullable = false)
    LocalDate dateApplied;

    @Column(nullable = false)
    String status;

    @Column(length = 1000)
    String notes;

    public Job() {
    }

    public Job(String company, String role, LocalDate dateApplied, String status, String notes) {
        this.company = company;
        this.role = role;
        this.dateApplied = dateApplied;
        this.status = status;
        this.notes = notes;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDateApplied(LocalDate dateApplied) {
        this.dateApplied = dateApplied;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getDateApplied() {
        return dateApplied;
    }

    public String getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }
}
