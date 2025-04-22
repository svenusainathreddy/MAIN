 package com.example.AdminService.Service;

import java.util.List;

import com.example.Backend.Model.ReportDTO;
import com.example.Backend.Model.User;
import com.example.FlightService.Model.Flight;

public interface AdminService {
    Flight saveOrUpdateFlight(Flight flight);
    List<User> getAllUsers();
    ReportDTO generateReport();
}
