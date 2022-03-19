package com.app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.core.pojos.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
