package system.hrms.business.abstracts;


import java.util.List;

import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.Job;

public interface JobService {

	Result add(Job job);
	DataResult<List<Job>> getAll();

}
