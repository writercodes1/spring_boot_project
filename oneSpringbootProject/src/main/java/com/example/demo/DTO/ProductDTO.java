package com.example.demo.DTO;

import javax.validation.constraints.NotBlank;

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

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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

	@Override
	public String toString() {
		return "ProductDTO [product_id=" + product_id + ", product_name=" + product_name + ", description="
				+ description + ", imageName=" + imageName + ", categoryId=" + categoryId + ", stock_quantity="
				+ stock_quantity + ", price=" + price + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String product_name;
	private String description;
	private String imageName;
	private String categoryId;
	private int stock_quantity;
	 
	private double price;
}
