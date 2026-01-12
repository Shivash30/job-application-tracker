package com.shivash.job_app_tracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class JobRequestDTO {
    @NotBlank
    private String company;

    @NotBlank
    private String role;

    @NotNull
    private LocalDate dateApplied;

    @NotNull
    private String status;

    private String notes;

    public JobRequestDTO() {
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
}
