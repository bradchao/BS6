package tw.brad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tw.brad.model.Customers;

public interface CustomersRepository extends JpaRepository<Customers, String>{
	
	// SELECT * FROM Customers WHERE CompanyName = ?
	public List<Customers> findByCompanyName(String companyName);
	public List<Customers> findAllByCompanyName(String companyName);
	public List<Customers> findAllByCompanyNameContaining(String companyNameKey);
	
	// SELECT * FROM Customers WHERE CompanyName LIKE %key%
	@Query("SELECT c FROM Customers c WHERE c.companyName LIKE %:key%")
	public List<Customers> findAllByCompanyNameLike(@Param("key") String key);
	

}
