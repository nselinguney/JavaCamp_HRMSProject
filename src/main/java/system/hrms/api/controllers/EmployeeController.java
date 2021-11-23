package system.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import system.hrms.business.abstracts.EmployeeService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.entities.concretes.Employee;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getAllEmployees")
	public DataResult<List<Employee>> getAllEmployees() {
		return this.employeeService.getAllEmployees();
	}
	

}
