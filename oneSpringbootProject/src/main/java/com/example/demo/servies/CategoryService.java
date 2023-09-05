package com.example.demo.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Categories;
import com.example.demo.model.Products;
import com.example.demo.repository.CategoryRepo;

@Service
public class CategoryService {
@Autowired
CategoryRepo categoryRepository;

public List<Categories> getAllCategory(){ return categoryRepository.findAll();}

public void addCat(Categories category) { categoryRepository.save(category);}
}
