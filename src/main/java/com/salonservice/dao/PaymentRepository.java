package com.salonservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salonservice.bean.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	
}
