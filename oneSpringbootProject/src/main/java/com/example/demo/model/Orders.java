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
@Table(name = "orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
private int order_id;

@ManyToOne
@JoinColumn(name="user_id")
private  Users user;

private String order_date;
@Override
public String toString() {
	return "Orders [order_id=" + order_id + ", user=" + user + ", order_date=" + order_date + ", total_amonnt="
			+ total_amonnt + ", shipping_address=" + shipping_address + ", payment_status=" + payment_status + "]";
}
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public Users getUser() {
	return user;
}
public void setUser(Users user) {
	this.user = user;
}
public String getOrder_date() {
	return order_date;
}
public void setOrder_date(String order_date) {
	this.order_date = order_date;
}
public int getTotal_amonnt() {
	return total_amonnt;
}
public void setTotal_amonnt(int total_amonnt) {
	this.total_amonnt = total_amonnt;
}
public String getShipping_address() {
	return shipping_address;
}
public void setShipping_address(String shipping_address) {
	this.shipping_address = shipping_address;
}
public String getPayment_status() {
	return payment_status;
}
public void setPayment_status(String payment_status) {
	this.payment_status = payment_status;
}
@NotBlank
private int total_amonnt;
private String shipping_address;
private String payment_status;
}
