package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Products;
import com.example.demo.model.Users;

public interface UserRepo  extends JpaRepository< Users,Integer>{

}
