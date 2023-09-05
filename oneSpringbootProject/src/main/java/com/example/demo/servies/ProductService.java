package com.example.demo.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

//import com.example.demo.model.Category;
import com.example.demo.model.Products;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo PR;
	public List<Products> getAllProducts(){ return PR.findAll();}
	
	
	
	public void addProduct(Products category) { PR.save(category);}
	public void removeProductById(Long id) {PR.deleteById(id); }	
    public Optional<Products> getProductById(Long id){ return PR.findById(id);}
   // public List<Products> getAllProductByCategoryId(int id){
  //  	return PR.findAllByCategory_Id(id);
  //  }
   
}
