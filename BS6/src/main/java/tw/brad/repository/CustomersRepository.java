package tw.brad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.brad.model.Customers;

public interface CustomersRepository extends JpaRepository<Customers, String>{
	
	// SELECT * FROM Customers WHERE CompanyName = ?
	public List<Customers> findByCompanyName(String companyName);
	public List<Customers> findAllByCompanyName(String companyName);
	public List<Customers> findAllByCompanyNameContaining(String companyNameKey);

}
