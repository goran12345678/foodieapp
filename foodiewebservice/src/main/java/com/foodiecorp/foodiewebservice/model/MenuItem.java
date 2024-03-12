package com.foodiecorp.foodiewebservice.model;

/*
 * Class represents a menu item common to all restaurants.
 */
public class MenuItem {
	String restaurantId;
	String name;
	String description;
	Float price;
	Integer quantity;
	public MenuItem() {
		// TODO Auto-generated constructor stub
	}
	public MenuItem(String restaurantId, String name, String description, Float price, Integer quantity) {
		this.restaurantId = restaurantId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "MenuItem [restaurantId=" + restaurantId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", quantity=" + quantity + "]";
	}

}
