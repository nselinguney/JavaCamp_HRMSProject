package system.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.hrms.business.abstracts.CandidateCvService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.CandidateCv;


@RestController
@RequestMapping("/api/candidateCvs")
public class CandidateCvController {
    
    private CandidateCvService candidateCvService;
    
    @Autowired
    public CandidateCvController(CandidateCvService candidateCvService) {
        this.candidateCvService = candidateCvService;
    }
    
    @PostMapping("/addCandidateCv")
    public Result addCandidateCv(@RequestBody CandidateCv candidateCv) {
            return this.candidateCvService.addCandidateCv(candidateCv);
    }
    
    @GetMapping("/getAllCandidateCv")
    public DataResult<List<CandidateCv>> getAllCandidateCv() {
            return this.candidateCvService.getAllCandidateCv();
    }
    
    
    
}
