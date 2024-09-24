package tw.brad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.brad.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long>{

}
