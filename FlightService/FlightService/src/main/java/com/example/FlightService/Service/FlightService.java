 package com.example.FlightService.Service;

import java.util.List;

import com.example.FlightService.Model.Flight;

public interface FlightService {
    List<Flight> searchFlights(String origin, String destination);
    Flight getFlightDetails(Long flightId);
    String selectSeat(Long flightId);
    String getFlightStatus(Long flightId);
}
