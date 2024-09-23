package tw.brad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.brad.model.Customers;
import tw.brad.repository.CustomersRepository;

@Service
public class CustomersServiceImpl implements CustomersService{

	@Autowired
	private CustomersRepository customersRepository;
	
	@Override
	public Customers getById(String customerId) {
		return customersRepository.findById(customerId).orElse(null);
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
	public List<Customers> getByCityOrCountry(String city, String country) {
		// TODO Auto-generated method stub
		return null;
	}

}
