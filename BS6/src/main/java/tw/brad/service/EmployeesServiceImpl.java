package tw.brad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.brad.model.Employees;
import tw.brad.model.Orders;
import tw.brad.repository.EmployeesRepository;

@Service
public class EmployeesServiceImpl implements EmployeesService {

	@Autowired
	private EmployeesRepository employeesRepository;
	
	@Autowired
	private OrdersService ordersService;
	
	@Override
	public Employees getById(Long id) {
		Employees employee = employeesRepository.findById(id).orElse(null);
		
		List<Orders> orders = employee.getOrders();
		for (Orders order : orders) {
			order = ordersService.getOrderById(order.getOrderId());
		}
		
		
		return employee;
	}

}
