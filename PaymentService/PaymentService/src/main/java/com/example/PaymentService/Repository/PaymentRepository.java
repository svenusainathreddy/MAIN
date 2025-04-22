 package com.example.PaymentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PaymentService.Model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}
