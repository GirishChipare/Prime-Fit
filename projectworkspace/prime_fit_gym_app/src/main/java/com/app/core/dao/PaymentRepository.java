package com.app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.core.pojos.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
