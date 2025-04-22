 package com.example.AdminService.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.Backend.Repository.UserRepository;
import com.example.AdminService.Model.ReportDTO;
import com.example.FlightService.Model.Flight;
import com.example.FlightService.Repository.FlightRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final FlightRepository flightRepository;
    private final UserRepository userRepository;

    
    public Flight saveOrUpdateFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    
    public ReportDTO generateReport() {
        // Mocked data for demonstration
        return ReportDTO.builder()
                .totalBookings(120)
                .totalRevenue(300000.00)
                .mostPopularDestination("Delhi")
                .build();
    }
}
