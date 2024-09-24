package tw.brad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.model.Employees;
import tw.brad.service.EmployeesService;

@RequestMapping("/employees")
@RestController
public class EmployeesController {

	@Autowired
	private EmployeesService employeesService;
	
	@GetMapping("/get/{emplyeeId}")
	public Employees getById(@PathVariable Long emplyeeId) {
		return employeesService.getById(emplyeeId);
	}
	
}
