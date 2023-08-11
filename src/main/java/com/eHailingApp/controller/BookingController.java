package com.eHailingApp.controller;

import com.eHailingApp.model.Booking;
import com.eHailingApp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    // Implement controller methods for handling HTTP requests
    // Use the bookingService to perform CRUD operations on bookings

}
