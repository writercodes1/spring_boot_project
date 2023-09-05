package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.global.GlobalData;
import com.example.demo.model.Products;
import com.example.demo.servies.ProductService;

@Controller
public class CartController {
@Autowired
ProductService PS;

@GetMapping("/addToCart/{id}")
public String addToCart(@PathVariable Long id) {
	GlobalData.cart.add(PS.getProductById(id).get());
	return "redirect:/products";
}

@GetMapping("/cart")
public String cartGet(Model model) {
	model.addAttribute("cartitem",GlobalData.cart.size()); 
	model.addAttribute("cartCount",GlobalData.cart.stream().mapToDouble(Products::getPrice).sum());
	model.addAttribute("cart",GlobalData.cart);
	return "cartList";
}
@GetMapping("/cart/removeItem/{index}")
public String cartItemRemove(@PathVariable int index) {
	GlobalData.cart.remove(index);
	return "plist";
}



}