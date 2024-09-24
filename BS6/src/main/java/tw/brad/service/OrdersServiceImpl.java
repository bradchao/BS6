package tw.brad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.brad.model.Orders;
import tw.brad.repository.OrdersRepository;

@Service
public class OrdersServiceImpl implements OrdersService{

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Override
	public Orders getOrderById(Long id) {
		return ordersRepository.findById(id).orElse(null);
	}

}
