package com.foodiecorp.foodiewebservice.service;

import com.foodiecorp.foodiewebservice.model.Menu;
import com.foodiecorp.foodiewebservice.model.Payment;
import com.foodiecorp.foodiewebservice.model.Response;

/*
 * Interface defines interaction between frontend and web service.
 */
public interface OrderService {
	
	public Response addToShoppingCart(Menu order);
	public Float getTotal(Menu order);
	public Response submitOrder(Menu order, Payment payment);
	public Menu getMenu();

}
