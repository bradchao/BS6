package tw.brad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.model.Orders;
import tw.brad.service.OrdersService;

@RequestMapping("/orders")
@RestController
public class OrdersController {
	@Autowired
	private OrdersService ordersService;
	
	@GetMapping("/get/{orderId}")
	public Orders getById(@PathVariable Long orderId) {
		return ordersService.getOrderById(orderId);
	}
	
}
