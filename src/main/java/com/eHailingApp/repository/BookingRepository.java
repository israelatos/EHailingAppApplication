package com.eHailingApp.repository;

import com.eHailingApp.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    // You can add custom methods here if needed
}

