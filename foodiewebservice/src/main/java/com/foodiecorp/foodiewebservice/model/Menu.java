package com.foodiecorp.foodiewebservice.model;

import java.io.Serializable;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

/*
 * Class envelope for menu items for specified restaurant
 */
@Entity
public class Menu implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer mid;
	
	String restaurantName; //displayed in frontend
	String restaurantHours; //displayed in frontend
	String restaurantAddress; //displayed in frontend
	@Transient
	ArrayList<MenuItem> menuItems; //populated by frontend
	Float total;
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	public Menu(String restaurantName, String restaurantHours, String restaurantAddress, ArrayList<MenuItem> menuItems) {
		this.restaurantName = restaurantName;
		this.restaurantHours = restaurantHours;
		this.restaurantAddress = restaurantAddress;
		this.menuItems = menuItems;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantHours() {
		return restaurantHours;
	}
	public void setRestaurantHours(String restaurantHours) {
		this.restaurantHours = restaurantHours;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	public void setMenuItems(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "Menu [restaurantName=" + restaurantName + ", restaurantHours=" + restaurantHours
				+ ", restaurantAddress=" + restaurantAddress + ", menuItems=" + menuItems + "]";
	}
	

}
