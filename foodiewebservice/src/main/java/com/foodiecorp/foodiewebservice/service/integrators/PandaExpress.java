package com.foodiecorp.foodiewebservice.service.integrators;

import java.util.ArrayList;

import com.foodiecorp.foodiewebservice.model.Menu;
import com.foodiecorp.foodiewebservice.model.MenuItem;
import com.foodiecorp.foodiewebservice.model.Payment;
import com.foodiecorp.foodiewebservice.service.IntegrationService;

public class PandaExpress  extends IntegrationService{

	Menu menu;
	
		public PandaExpress() {
		// TODO Auto-generated constructor stub
			menu  = new Menu();
			menu.setRestaurantAddress("123 Panda Walkway");
			menu.setRestaurantHours("6-12 Every day");
			menu.setRestaurantName("Panda Express");
		
			MenuItem item1 = new MenuItem("", "Panda Noodles","Beef noodles with rice",20.0f, 0);
			MenuItem item2 = new MenuItem("", "Sweet and Sour Chicken","Sweet and sour source with noodels and chicken",30.0f, 0);
			MenuItem item3 = new MenuItem("", "Madarin Beef","Beef with noodles and peppers",25.0f, 0);
			
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
		return "succesfull";
	}

}
