package system.hrms.business.abstracts;


import java.util.List;

import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	Result add(Employer employer);
	DataResult<List<Employer>> getAllEmployers();
}
