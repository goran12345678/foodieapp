package com.foodiecorp.foodiewebservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.foodiecorp.foodiewebservice.model.Menu;
import com.foodiecorp.foodiewebservice.model.Order;
import com.foodiecorp.foodiewebservice.model.Response;
import com.foodiecorp.foodiewebservice.repository.OrderRepository;
import com.foodiecorp.foodiewebservice.service.IntegrationService;
import com.foodiecorp.foodiewebservice.service.integrators.JerseyMikes;
import com.foodiecorp.foodiewebservice.service.integrators.PandaExpress;
import com.foodiecorp.foodiewebservice.service.integrators.Pepes;

@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired
	OrderRepository repository;
	
	HashMap<String,IntegrationService> integrators;
	HashMap<String, Menu> shoppingCart;
	
	public AppController() {
		// TODO Auto-generated constructor stub
		System.out.println("[AppController] constructor called");
		shoppingCart = new HashMap<String, Menu>();
		integrators = new HashMap<String, IntegrationService>();
		PandaExpress integrator1 = new PandaExpress();
		Pepes integrator2 = new Pepes();
		JerseyMikes integrator3 = new JerseyMikes();
		
		integrators.put(integrator1.getMenu().getRestaurantName(), integrator1);
		integrators.put(integrator2.getMenu().getRestaurantName(), integrator2);
		integrators.put(integrator3.getMenu().getRestaurantName(), integrator3);
	}
	@CrossOrigin
	@GetMapping("/getmenus")
	public ArrayList<Menu> getRestaurants(){
		System.out.println("[AppController] getRestaurants called");
		ArrayList<Menu> menus = new ArrayList<Menu>();
		Iterator<String> itr = integrators.keySet().iterator();
		while(itr.hasNext()) {
			String key = (String) itr.next();
			menus.add(integrators.get(key).getMenu());
		}
		
		return menus;
	}
	@CrossOrigin
	@PostMapping("/gettotal")
	public Float getTotal(@RequestBody Menu menu) {
			IntegrationService integrator  = integrators.get(menu.getRestaurantName());
			integrator.setTotal(menu);
			return menu.getTotal();
	}
	@CrossOrigin
	@PostMapping("/submitorder")
	public Response submitOrder(@RequestBody Order order) {
		System.out.println("[AppController] submitOrder called");

		IntegrationService integrator = integrators.get(order.getMenu().getRestaurantName());
		integrator.submitOrder(order.getMenu(), order.getPayment());
		
		Response response = new Response();
		response.setSuccess(true);
		response.setMessage("successfull");
		
		//Challenge if you choose to accept it. Figure out how to add a timestamp to the Menu.
		repository.save(order.getMenu()); //Compliance issues with saving Payment information
		
		return response;
	}

}
