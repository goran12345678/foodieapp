package com.foodiecorp.foodiewebservice.model;

import java.util.ArrayList;

/*
 * Class envelope for menu items for specified restaurant
 */
public class Menu {
	String restaurantName; //displayed in frontend
	String restaurantHours; //displayed in frontend
	String restaurantAddress; //displayed in frontend
	ArrayList<Menu> menuItems; //populated by frontend
	Float total;
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	public Menu(String restaurantName, String restaurantHours, String restaurantAddress, ArrayList<Menu> menuItems) {
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
	public ArrayList<Menu> getMenuItems() {
		return menuItems;
	}
	public void setMenuItems(ArrayList<Menu> menuItems) {
		this.menuItems = menuItems;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Menu [restaurantName=" + restaurantName + ", restaurantHours=" + restaurantHours
				+ ", restaurantAddress=" + restaurantAddress + ", menuItems=" + menuItems + "]";
	}
	

}
