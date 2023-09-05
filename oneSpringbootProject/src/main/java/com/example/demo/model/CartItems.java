package com.example.demo.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cartitem")
public class CartItems {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  card_item_id;
	
	@ManyToOne
	@JoinColumn(name="carts_id")
	private Carts cart;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Products product;
	
	
	public int getCard_item_id() {
		return card_item_id;
	}
	public void setCard_item_id(int card_item_id) {
		this.card_item_id = card_item_id;
	}
	public Carts getCart() {
		return cart;
	}
	public void setCart(Carts cart) {
		this.cart = cart;
	}
	public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@NotBlank
	private String quantity;
}
