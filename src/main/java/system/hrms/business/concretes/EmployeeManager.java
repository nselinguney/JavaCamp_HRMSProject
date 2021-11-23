package system.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import system.hrms.business.abstracts.EmployeeService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.SuccessDataResult;
import system.hrms.dataAccess.abstracts.EmployeeDao;
import system.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	EmployeeDao employeeDao;

        public EmployeeManager() {
            super();
        }
        
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAllEmployees() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Çalışanlar listelendi.");
	}

}
