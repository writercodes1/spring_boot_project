package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "carts")
public class Carts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  carts_id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private Categories categories;
	private LocalDateTime created_at;
	@Override
	public String toString() {
		return "Carts [carts_id=" + carts_id + ", categories=" + categories + ", created_at=" + created_at + "]";
	}
	public int getCarts_id() {
		return carts_id;
	}
	public void setCarts_id(int carts_id) {
		this.carts_id = carts_id;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
}
