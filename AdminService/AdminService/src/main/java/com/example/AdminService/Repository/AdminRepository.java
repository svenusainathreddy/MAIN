package com.example.AdminService.Repository;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AdminService.Model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    // You can define custom queries here if needed
}

