package com.eHailingApp.service;

import com.eHailingApp.model.Booking;
import com.eHailingApp.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Booking booking) {
        // Implement logic to create a new booking and save it to the database
        return bookingRepository.save(booking);
    }

    public Optional<Booking> getBookingById(Long id) {
        // Implement logic to retrieve a booking by its ID from the database
        return bookingRepository.findById(id);
    }

    public List<Booking> getAllBookings() {
        // Implement logic to retrieve all bookings from the database
        return bookingRepository.findAll();
    }

    public Booking updateBooking(Booking booking) {
        // Implement logic to update an existing booking in the database
        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        // Implement logic to delete a booking by its ID from the database
        bookingRepository.deleteById(id);
    }

    // Add other methods as needed

}
