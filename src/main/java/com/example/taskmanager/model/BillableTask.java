package com.example.taskmanager.model;

import jakarta.persistence.Entity;

@Entity
public class BillableTask extends Task {

    private double hourlyRate;

    // Getters y Setters
    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }
}
