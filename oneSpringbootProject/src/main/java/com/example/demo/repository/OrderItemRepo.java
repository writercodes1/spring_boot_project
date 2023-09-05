package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.OrderItems;

public interface OrderItemRepo extends JpaRepository<OrderItems ,Integer>{

}
