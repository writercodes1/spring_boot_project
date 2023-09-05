package com.example.demo.controller;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Products;
import com.example.demo.model.Users;
import com.example.demo.repository.ProductRepo;
import com.example.demo.repository.UserRepo;
 

@Controller
public class userController {

	 @Autowired
	    private UserRepo userrepo_obj;
	   
	 
	 @GetMapping("/")
	    public String reg(){
	        return "reg";
	    }
	 
	 @GetMapping("/login")
	    public String login(){
	        return "welcome";
	    }
 	  
	 @GetMapping("/admin")
	    public String admin(){
	        return "adminn";
	    }
	  

	     @PostMapping("/createuser")
	     public String post(Users usernew,Model model){
	       System.out.println("******************");
	       System.out.println("inside create");
	       System.out.println("******************");
	       userrepo_obj.save(usernew);
//	        
	       return "redirect:/products";
	       
	     }
	 }


