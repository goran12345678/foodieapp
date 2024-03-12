package com.foodiecorp.foodiewebservice.service;

import com.foodiecorp.foodiewebservice.model.Menu;
import com.foodiecorp.foodiewebservice.model.Payment;

/*
 * Class manages the interaction between the restaurant API and foodieapp web service.
 */
public class IntegrationServiceImpl implements IntegrationService {

	@Override
	public String getMenuItems() {
		// TODO Auto-generated method stub
		return "ok";
	}

	@Override
	public String getTotal(Menu order) {
		// TODO Auto-generated method stub
		return "ok";
	}

	@Override
	public String submitOrder(Menu order, Payment payment) {
		// TODO Auto-generated method stub
		return "ok";
	}

}
