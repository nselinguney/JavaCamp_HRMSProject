package system.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import system.hrms.business.abstracts.CandidateService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.ErrorResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.core.utilities.results.SuccessDataResult;
import system.hrms.core.utilities.results.SuccessResult;
import system.hrms.dataAccess.abstracts.CandidateDao;
import system.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	CandidateDao candidateDao;
	
	public CandidateManager() {
		super();
	}


	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public Result add(Candidate candidate) {
		if(this.candidateDao.existsByEmail(candidate.getEmail())) {
		return new ErrorResult("Bu E-Mail adresi kullanımda. Lütfen başka bir adres seçiniz.");
		}
		else {
			this.candidateDao.save(candidate);
			return new SuccessResult("Kullanıcı eklendi.");
		}
	}


	@Override
	public DataResult<List<Candidate>> getAllCandidates() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"İş arayanlar listelendi.");
	}

}
