package com.eHailingApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String passengerContactNumber;

    // Other fields...

    // Constructor, getters, setters...

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    // Other getter and setter methods...
    private LocalDateTime pickupTime;
    private boolean asap;
    private int waitingTime;
    private int numberOfPassengers;
    private double price;
    private double rating;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdOn;

    private LocalDateTime lastModifiedOn;

    // Define relationships, getters, setters, and other methods here

// ... other properties

    // Getters and setters

    // Additional methods if needed
}

