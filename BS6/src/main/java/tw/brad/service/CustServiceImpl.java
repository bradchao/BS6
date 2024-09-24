package tw.brad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.brad.model.Cust;
import tw.brad.model.Customers;
import tw.brad.repository.CustRepo;

@Service
public class CustServiceImpl implements CustomersService{

	@Autowired
	private CustRepo custRepo;
	
	@Override
	public String getCompanyById(String customerId) {
		String test = custRepo.findCustomerId(customerId);
		System.out.println(test);
		return custRepo.findCustomerId(customerId);
	}
	
	@Override
	public Cust getCompanyByIdV2(String customerId) {
		return custRepo.findCustomerIdV2(customerId);
	}

	@Override
	public List<Customers> getAll() {
		return custRepo.findAll();
	}

	@Override
	public List<Customers> getByCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customers> getByCompanyNameKey(String companyNameKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customers> getByCompanyNameLike(String companyNameKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customers> getByCompanyNameLikeSQL(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customers> getByCityOrCountry(String city, String country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customers getById(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}


}
