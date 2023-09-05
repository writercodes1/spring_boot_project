package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Carts;

public interface CartRepo extends JpaRepository< Carts,Integer> {

}
 