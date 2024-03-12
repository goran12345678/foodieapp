package com.foodiecorp.foodiewebservice.service;

import com.foodiecorp.foodiewebservice.model.Menu;
import com.foodiecorp.foodiewebservice.model.Payment;

/*
 * Interface defines integration between restaurant API and web service
 */
public interface IntegrationService {
	// Call restaurant API for menu items
	public String getMenuItems();
	// Call restaurant to get total for display
	public String getTotal(Menu order);
	// Send order to restaurant.
	public String submitOrder(Menu order, Payment payment);
	
}
