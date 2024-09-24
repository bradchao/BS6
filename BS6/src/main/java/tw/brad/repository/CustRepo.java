package tw.brad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tw.brad.model.Cust;
import tw.brad.model.Customers;

/*
 * JPQL => Java 物件
 */
public interface CustRepo extends JpaRepository<Customers, String> {
	@Query("SELECT c FROM Customers c")
	List<Customers> findAllCustomers();
	
//	@Query("SELECT c.companyName FROM Customers c WHERE c.customerId = :id")
//	String findCustomerId(@Param("id") String customerID);

	@Query("SELECT 'Hello'")
	String findCustomerId(String customerID);
	
	@Query("SELECT new tw.brad.model.Cust(c.companyName, c.city, c.country) FROM Customers c WHERE c.customerId = :id")
	Cust findCustomerIdV2(@Param("id") String customerID);
	
	
}
