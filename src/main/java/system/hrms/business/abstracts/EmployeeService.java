package system.hrms.business.abstracts;


import java.util.List;

import system.hrms.core.utilities.results.DataResult;
import system.hrms.entities.concretes.Employee;


public interface EmployeeService {

	DataResult<List<Employee>> getAllEmployees();
}

