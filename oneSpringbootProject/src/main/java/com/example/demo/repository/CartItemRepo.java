package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CartItems;

 

 

public interface CartItemRepo extends JpaRepository<CartItems,Integer> {

}
