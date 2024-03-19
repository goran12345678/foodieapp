package com.foodiecorp.foodiewebservice.service.integrators;

import java.util.ArrayList;

import com.foodiecorp.foodiewebservice.model.Menu;
import com.foodiecorp.foodiewebservice.model.MenuItem;
import com.foodiecorp.foodiewebservice.model.Payment;
import com.foodiecorp.foodiewebservice.service.IntegrationService;

public class Pepes  extends IntegrationService{
	
	Menu menu;
	
	public Pepes() {
		// TODO Auto-generated constructor stub
		menu  = new Menu();
		menu.setRestaurantAddress("333 Kitche Blvd");
		menu.setRestaurantHours("6-10 M-S");
		menu.setRestaurantName("Pepe's Pizza");
	
		MenuItem item1 = new MenuItem("", "Cheese Pizza","House special cheese pizza",30.0f, 0);
		MenuItem item2 = new MenuItem("", "Supreme Pizza","Five toppings house classic",35.0f, 0);
		MenuItem item3 = new MenuItem("", "Surprise Me","Find out when you get it",10.0f, 0);
		
		ArrayList<MenuItem> items = new ArrayList<MenuItem>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		menu.setMenuItems(items);
	}
	@Override
	public Menu getMenu() {
		// TODO Auto-generated method stub
		return menu;
	}

	@Override
	public void setTotal(Menu order) {
		// TODO Auto-generated method stub
		float total = 0;
		for(MenuItem item : order.getMenuItems())
		{
			if(item.getIsSelected() != null && item.getIsSelected())
			total += item.getPrice();
		}
		order.setTotal(total);
	}

	@Override
	public String submitOrder(Menu order, Payment payment) {
		// TODO Auto-generated method stub
		return "successfull";
	}

}
