 package com.example.PaymentService.Service;

import com.example.PaymentService.Model.Payment;

public interface PaymentService {
    void processPayment(Payment payment);
    Payment getPaymentStatus(String paymentId);
}
