package com.foodiecorp.foodiewebservice.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 * Class represents a menu item common to all restaurants.
 */
@Entity
public class MenuItem implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer miid;
	
	String restaurantId;
	String name;
	String description;
	Float price;
	Integer quantity;
	Boolean isSelected;
	
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
	public Boolean getIsSelected() {
		return isSelected;
	}
	public void setIsSelected(Boolean isSelected) {
		this.isSelected = isSelected;
	}
	public Integer getMiid() {
		return miid;
	}
	public void setMiid(Integer miid) {
		this.miid = miid;
	}
	@Override
	public String toString() {
		return "MenuItem [restaurantId=" + restaurantId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", quantity=" + quantity + "]";
	}

}
