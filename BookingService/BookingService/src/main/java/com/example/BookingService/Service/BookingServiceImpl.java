 package com.example.BookingService.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookingService.Model.Booking;
import com.example.BookingService.Repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

     
    public Booking createBooking(Booking booking) {
        booking.setBookingDate(LocalDateTime.now());
        booking.setStatus("CONFIRMED");
        return bookingRepository.save(booking);
    }

    @Override
    public Booking getBooking(String bookingId) {
        return bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
    }

    @Override
    public Booking modifyBooking(String bookingId, Booking updatedBooking) {
        Booking existing = getBooking(bookingId);
        existing.setSeatNumber(updatedBooking.getSeatNumber());
        existing.setAmountPaid(updatedBooking.getAmountPaid());
        return bookingRepository.save(existing);
    }

    @Override
    public void cancelBooking(String bookingId) {
        Booking booking = getBooking(bookingId);
        booking.setStatus("CANCELLED");
        bookingRepository.save(booking);
    }

    @Override
    public void refundBooking(String bookingId) {
        Booking booking = getBooking(bookingId);
        if ("CANCELLED".equals(booking.getStatus())) {
            booking.setStatus("REFUNDED");
            bookingRepository.save(booking);
        } else {
            throw new RuntimeException("Refund not allowed unless booking is cancelled.");
        }
    }
}
