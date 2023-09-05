package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class Reviews {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int review_id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private  Users user;
	
	private int ratig;
	@Override
	public String toString() {
		return "Reviews [review_id=" + review_id + ", user=" + user + ", ratig=" + ratig + ", review_text="
				+ review_text + ", review_date=" + review_date + "]";
	}
	public int getReview_id() {
		return review_id;
	}
	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public int getRatig() {
		return ratig;
	}
	public void setRatig(int ratig) {
		this.ratig = ratig;
	}
	public String getReview_text() {
		return review_text;
	}
	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}
	public String getReview_date() {
		return review_date;
	}
	public void setReview_date(String review_date) {
		this.review_date = review_date;
	}
	private String review_text;
	private String review_date;
}
