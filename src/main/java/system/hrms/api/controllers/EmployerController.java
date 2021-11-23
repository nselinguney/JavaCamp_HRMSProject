package system.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import system.hrms.business.abstracts.EmployerService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.Employer;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("api/employers")
public class EmployerController {
	
	EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getAllEmployers")
	public DataResult<List<Employer>> getAllEmployers(){
		
		return this.employerService.getAllEmployers();
	}
	
	 @PostMapping("/addEmployer")
	 public Result add(@RequestBody Employer employer){
       return this.employerService.add(employer);
     }
}
