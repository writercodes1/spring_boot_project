package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Orders;

public interface OrderRepo extends JpaRepository< Orders,Integer>{

}
