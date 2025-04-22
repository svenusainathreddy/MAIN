 package com.example.FlightService.Repository;
  
 import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FlightService.Model.Flight;

 public interface FlightRepository extends JpaRepository<Flight, Long> {
     List<Flight> findByOriginAndDestination(String origin, String destination);
 }
