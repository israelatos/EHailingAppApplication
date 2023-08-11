package com.eHailingApp.repository;

import com.eHailingApp.model.TripWaypoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripWaypointRepository extends JpaRepository<TripWaypoint, Long> {
    // You can add custom methods here if needed
}

