package com.example.demo.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long product_id;
	 
	 
	@NotBlank
	private String product_name;
	private String description;
	private String imageName;
	 

	@Override
	public String toString() {
		return "Products [product_id=" + product_id + ", product_name=" + product_name + ", description=" + description
				+ ", imageName=" + imageName + ", stock_quantity=" + stock_quantity + ", price=" + price
				+ ", category_id=" + category_id + "]";
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	 

	private int stock_quantity;
	@NotBlank
	private double price;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="category_id")
	private Categories category_id;

	 

	public Categories getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Categories category_id) {
		this.category_id = category_id;
	}

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

	 
}
