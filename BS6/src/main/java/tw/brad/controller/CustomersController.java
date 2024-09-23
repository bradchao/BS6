package tw.brad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.model.Customers;
import tw.brad.service.CustomersService;

@RequestMapping("/customers")
@RestController
public class CustomersController {

	@Autowired
	private CustomersService customersService;
	
	@GetMapping("/get/{customerId}")
	public Customers getById(@PathVariable String customerId) {
		return customersService.getById(customerId);
	}
	
	
	
}
