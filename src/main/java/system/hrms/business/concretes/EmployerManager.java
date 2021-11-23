package system.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import system.hrms.business.abstracts.EmployerService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.ErrorResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.core.utilities.results.SuccessDataResult;
import system.hrms.core.utilities.results.SuccessResult;
import system.hrms.dataAccess.abstracts.EmployerDao;
import system.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result add(Employer employer) {
		if(this.employerDao.existsByEmail(employer.getEmail())) {
			return new ErrorResult("Bu E-Mail adresi kullanımda. Başka bir adresle kayıt yapınız.");
		} else {
			this.employerDao.save(employer);
			return new SuccessResult("Kullanıcı kaydedildi.");
		}
	}

	@Override
	public DataResult<List<Employer>> getAllEmployers() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"İşverenler listelendi.");
	}
}
