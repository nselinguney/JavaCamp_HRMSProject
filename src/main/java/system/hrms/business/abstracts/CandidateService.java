package system.hrms.business.abstracts;


import java.util.List;

import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.Candidate;


public interface CandidateService {

	Result add(Candidate candidate);
	DataResult<List<Candidate>> getAllCandidates();
}
