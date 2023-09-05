package com.example.demo.controller;

 
 


 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.model.Products;
import com.example.demo.servies.CategoryService;
import com.example.demo.servies.ProductDTO;
import com.example.demo.servies.ProductService;
 
@Controller


public class productController {
	@Autowired
	   ProductService productService;
	@Autowired
	   CategoryService  categoryService; 
	
	@GetMapping("/products")
	public String Product(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "plist";
	}
	@GetMapping("/admin/products")
	public String Products(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "adplist";
	}
	@GetMapping("/admin/products/add")
	public String Productss() {
	 	return "regproducts";
	}
 
	@PostMapping("/admin/products/added")	
	public String postproAdd(@ModelAttribute("category")  Products category,Model model) {
		productService.addProduct(category);
		model.addAttribute( "categories",categoryService.getAllCategory());
		return "regproducts";
	}
	 
	@GetMapping("/delete/{id}")	
	public String deletePro(@PathVariable Long id) {
		productService.removeProductById(id); 
		return "redirect:/admin/products";
	}
	
	@GetMapping("/update/{id}")	
	public String updatePro(@PathVariable Long id,Model model) {
		  Products oldproduct=  productService.getProductById(id).get();
		  
		  ProductDTO product= new ProductDTO();
		  product.setProduct_id(oldproduct.getProduct_id());
		  product.setProduct_name(oldproduct.getProduct_name() );
		  
		  product.setPrice(oldproduct.getPrice());
		  product.setDescription(oldproduct.getDescription());
		  product.setStock_quantity(oldproduct.getStock_quantity());
		  productService.removeProductById(id);
		  model.addAttribute("categories",categoryService.getAllCategory());
		  model.addAttribute("products",product);
		return "regproducts";
	}
	
	 
	
}
	

	 