package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Payments;

public interface PaymentRepo extends JpaRepository< Payments,Integer>{

}
