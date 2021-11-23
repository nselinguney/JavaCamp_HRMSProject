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
import system.hrms.business.abstracts.CandidateService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.Candidate;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
	
	CandidateService candidateService;

	
	public CandidateController() {
		super();
	}

	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getAllCandidates")
	public DataResult<List<Candidate>> getAll() {
		return this.candidateService.getAllCandidates();
	}
	
	 @PostMapping("/addCandidate")
	 public Result add(@RequestBody Candidate candidate){
       return this.candidateService.add(candidate);
     }
	

}

