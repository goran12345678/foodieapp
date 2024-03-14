package com.foodiecorp.foodiewebservice.model;

public class Order {
	Menu menu;
	Payment payment;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Menu menu, Payment payment) {
		this.menu = menu;
		this.payment = payment;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
