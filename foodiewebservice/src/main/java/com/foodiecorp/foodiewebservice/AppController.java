package com.foodiecorp.foodiewebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodiecorp.foodiewebservice.model.Menu;
import com.foodiecorp.foodiewebservice.model.Payment;
import com.foodiecorp.foodiewebservice.model.Response;
import com.foodiecorp.foodiewebservice.service.IntegrationServiceImpl;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired
	IntegrationServiceImpl intergrationSrv;
	
	@PostMapping("/addtoshoppingcart")
	public Menu addToShoppingCart(Menu menu) {
		
		float total = Float.parseFloat(intergrationSrv.getTotal(menu));
		menu.setTotal(total);
		
		return menu;
	}
	
	@GetMapping("/getmenu")
	public Menu getMenu() {
		Menu menu = new Menu();
		
		
		
		return menu;
	}
	@PostMapping("/submitorder")
	public Response submitOrder(Menu menu, Payment payment) {
		Response response = new Response();
		
		return response;
	}

}
