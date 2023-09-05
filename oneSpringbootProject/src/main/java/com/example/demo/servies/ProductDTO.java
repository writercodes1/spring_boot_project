package com.example.demo.servies;

 
import com.example.demo.model.Categories;

import lombok.Data;


public class ProductDTO {
	private Long product_id;
	 
	 

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStock_quantity() {
		return stock_quantity;
	}

	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	 

	private String product_name;
	private String description;
 
	private int stock_quantity;
	 
	private double price;
	  
	private int categoryId;



	@Override
	public String toString() {
		return "ProductDTO [product_id=" + product_id + ", product_name=" + product_name + ", description="
				+ description + ", stock_quantity=" + stock_quantity + ", price=" + price + ", categoryId=" + categoryId
				+ "]";
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
