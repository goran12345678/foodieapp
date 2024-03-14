package com.foodiecorp.foodiewebservice.service;

import com.foodiecorp.foodiewebservice.model.Menu;
import com.foodiecorp.foodiewebservice.model.Payment;

/*
 * Interface defines integration between restaurant API and web service
 */
public abstract  class IntegrationService {
	// Call restaurant API for menu items
	public abstract Menu getMenu();
	// Call restaurant to get total for display
	public abstract void setTotal(Menu order);
	// Send order to restaurant.
	public abstract String submitOrder(Menu order, Payment payment);
	
}
