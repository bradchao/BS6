package tw.brad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.model.Customers;
import tw.brad.model.QueryDate;
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

	@PostMapping("/getByDate/{customerId}")
	public Customers getByDate(@PathVariable String customerId, 
				@RequestBody QueryDate queryDate) {
		System.out.println(queryDate.getMin());
		System.out.println(queryDate.getMax());
		return customersService.getById(customerId);
	}

	
	@GetMapping("/getByCompanyName/{companyName}")
	public List<Customers> getByCompanyName(@PathVariable String companyName) {
		return customersService.getByCompanyName(companyName);
	}
	
	@GetMapping("/getByCompanyNameKey/{key}")
	public List<Customers> getByCompanyNameKey(@PathVariable String key) {
		return customersService.getByCompanyNameKey(key);
	}

	@GetMapping("/getByCompanyNameLike/{key}")
	public List<Customers> getByCompanyNameLike(@PathVariable String key) {
		return customersService.getByCompanyNameLike(key);
	}
	
	@GetMapping("/getByCompanyNameLikeSQL/{key}")
	public List<Customers> getByCompanyNameLikeSQL(@PathVariable String key) {
		return customersService.getByCompanyNameLikeSQL(key);
	}

	@GetMapping("/getByCityOrCountry/{city}/{country}")
	public List<Customers> getByCityOrCountry(@PathVariable String city,@PathVariable String country) {
		return customersService.getByCityOrCountry(city, country);
	}
	
	
	
}
