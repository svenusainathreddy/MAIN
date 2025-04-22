 package com.example.BookingService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookingService.Model.Booking;

 

public interface BookingRepository extends JpaRepository<Booking, String> {
}
