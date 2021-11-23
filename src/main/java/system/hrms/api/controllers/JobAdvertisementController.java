package system.hrms.api.controllers;

import java.util.List;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import system.hrms.business.abstracts.JobAdvertisementService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.JobAdvertisement;
import system.hrms.entities.dtos.JobAdvertisementDto;


@NoArgsConstructor
@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementController {
    
    JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        super();
        this.jobAdvertisementService = jobAdvertisementService;
    }
    
    @PostMapping("/addJobAdvertisement")
    public Result addJobAdvertisement(@RequestBody JobAdvertisementDto jobAdvertisementDto){
	return this.jobAdvertisementService.add(jobAdvertisementDto);
    }
    
    @GetMapping("/getAllJobAdvertisements")
    public DataResult<List<JobAdvertisement>> getAll() {
        return this.jobAdvertisementService.getAll();
    }
    
    @GetMapping("/getAllActives")
    DataResult<List<JobAdvertisement>> getAllActives(){
        return this.jobAdvertisementService.getAllActives();
    }
    
    @GetMapping("/getAllActivesByCompanyId")
    DataResult<List<JobAdvertisement>> getAllActivesByCompanyId(@RequestParam int id){
        return this.jobAdvertisementService.findAllActivesByCompanyId(id);
    }
    
    @GetMapping("/getAllOrderByApplicationDeadlineAsc")
    DataResult<List<JobAdvertisement>> getAllOrderByApplicationDeadlineAsc(){
        return this.jobAdvertisementService.findAllByOrderByApplicationDeadlineAsc();
    }
    
    @GetMapping("/getAllOrderByApplicationDeadlineDesc")
    DataResult<List<JobAdvertisement>> getAllOrderByApplicationDeadlineDesc(){
        return this.jobAdvertisementService.findAllByOrderByApplicationDeadlineDesc();
    }
    
}
