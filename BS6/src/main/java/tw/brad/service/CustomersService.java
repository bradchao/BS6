package tw.brad.service;

import java.util.List;

import tw.brad.model.Cust;
import tw.brad.model.Customers;

public interface CustomersService {
	public Customers getById(String customerId);
	public String getCompanyById(String customerId);
	public Cust getCompanyByIdV2(String customerId);
	
	public List<Customers> getAll();
	
	public List<Customers> getByCompanyName(String companyName);
	public List<Customers> getByCompanyNameKey(String companyNameKey);
	public List<Customers> getByCompanyNameLike(String companyNameKey);
	public List<Customers> getByCompanyNameLikeSQL(String key);
	
	public List<Customers> getByCityOrCountry(String city, String country);
}
