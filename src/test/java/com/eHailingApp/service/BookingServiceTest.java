package com.eHailingApp.service;

import com.eHailingApp.model.Booking;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingServiceTest {
    // Your test methods will go here

    @Autowired
    private BookingService bookingService;

    public BookingServiceTest(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @Test
    public void testCreateBooking() {
        // Create and save a booking using the bookingService
        Booking booking = new Booking(/*...*/);
        Booking savedBooking = bookingService.createBooking(booking);

        // Assert that the saved booking matches the expected values
        assertEquals(booking.getPassengerName(), savedBooking.getPassengerName());
        // Add more assertions as needed
    }
}

