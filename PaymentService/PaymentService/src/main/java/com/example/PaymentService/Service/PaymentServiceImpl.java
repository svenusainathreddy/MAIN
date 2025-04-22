 package com.example.PaymentService.Service;

import org.springframework.stereotype.Service;

import com.example.PaymentService.Model.Payment;
import com.example.PaymentService.Repository.PaymentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Override
    public void processPayment(Payment payment) {
        payment.setStatus("SUCCESS"); // Simulated success
        paymentRepository.save(payment);
    }

    @Override
    public Payment getPaymentStatus(String paymentId) {
        return paymentRepository.findById(paymentId)
                .orElseThrow(() -> new RuntimeException("Payment not found"));
    }
}
