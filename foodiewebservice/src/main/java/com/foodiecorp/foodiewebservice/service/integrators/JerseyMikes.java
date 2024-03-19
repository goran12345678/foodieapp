package com.foodiecorp.foodiewebservice.service.integrators;

import java.util.ArrayList;

import com.foodiecorp.foodiewebservice.model.Menu;
import com.foodiecorp.foodiewebservice.model.MenuItem;
import com.foodiecorp.foodiewebservice.model.Payment;
import com.foodiecorp.foodiewebservice.service.IntegrationService;

public class JerseyMikes extends IntegrationService{
	Menu menu;

	public JerseyMikes() {
		// TODO Auto-generated constructor stub
		menu  = new Menu();
		menu.setRestaurantAddress("123 South St");
		menu.setRestaurantHours("6-9 M-S");
		menu.setRestaurantName("Jersey Mike's");
	
		MenuItem item1 = new MenuItem("", "Pizza","Large all topping pizza",20.0f, 0);
		MenuItem item2 = new MenuItem("", "Hamburger","Double double triplle gonzo burger",30.0f, 0);
		MenuItem item3 = new MenuItem("", "Cheese Cake","Slice of our delicous cheese cake",10.0f, 0);
		
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
		//call restaurant API for total
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
		//call restaurant API for submission
		return "success";
	}


}
