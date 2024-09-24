package tw.brad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import tw.brad.model.Cust;
import tw.brad.model.Customers;
import tw.brad.model.Orders;
import tw.brad.repository.CustomersRepository;

@Service
public class CustomersServiceImpl implements CustomersService{

	@Autowired
	private CustomersRepository customersRepository;
	
	@Autowired
	private OrdersService ordersService;
	
	
	@Override
	public Customers getById(String customerId) {
		Customers customer = customersRepository.findById(customerId).orElse(null); 
		
		List<Orders> orders = customer.getOrders();
		for (Orders order : orders) {
			order = ordersService.getOrderById(order.getOrderId());
		}
		
		return customer;
	}

	@Override
	public List<Customers> getByCompanyName(String companyName) {
		return customersRepository.findByCompanyName(companyName);
	}

	@Override
	public List<Customers> getByCompanyNameKey(String companyNameKey) {
		return customersRepository.findAllByCompanyNameContaining(companyNameKey);
	}

	@Override
	public List<Customers> getByCompanyNameLike(String companyNameKey) {
		return customersRepository.findAllByCompanyNameLike(companyNameKey);
	}

	@Override
	public List<Customers> getByCompanyNameLikeSQL(String key) {
		String like = "%" + key + "%";
		return customersRepository.findAllBySQL(like);
	}
	
	@Override
	public List<Customers> getByCityOrCountry(String city, String country) {
		return customersRepository.findByCityOrCountry(city, country, Sort.by(Sort.Direction.ASC, "customerId"));
	}

	@Override
	public List<Customers> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCompanyById(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cust getCompanyByIdV2(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
