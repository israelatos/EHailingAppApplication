package com.eHailingApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TripWaypoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String locality;
    private double latitude;
    private double longitude;

    // Constructors, getters, setters, and other methods

    // You can add additional methods or annotations as needed
}


