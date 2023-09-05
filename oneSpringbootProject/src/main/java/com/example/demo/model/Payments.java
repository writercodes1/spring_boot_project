package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "payments")
public class Payments {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payment_id;
	
	@ManyToOne
	@JoinColumn(name="order_id")
	private  Orders order;
	
	@Override
	public String toString() {
		return "Payments [payment_id=" + payment_id + ", order=" + order + ", payment_date=" + payment_date
				+ ", payment_amount=" + payment_amount + ", payment_status=" + payment_status + "]";
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	 
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public String getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}
	public int getPayment_amount() {
		return payment_amount;
	}
	public void setPayment_amount(int payment_amount) {
		this.payment_amount = payment_amount;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	private String payment_date;
	private int payment_amount;
	private String payment_status;
} 
