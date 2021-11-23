package system.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import system.hrms.business.abstracts.JobService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.Job;

@RestController
@RequestMapping("api/jobs")
public class JobsController {

	private JobService jobService;

        public JobsController() {
        }
        
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	@GetMapping("/getAllJobs")
	public DataResult<List<Job>> getAll() {
		return this.jobService.getAll();
	}
	
	@PostMapping("/addJob")
	public Result addJob(@RequestBody Job job) {
		return this.jobService.add(job);
	}
}
