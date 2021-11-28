package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.CandidateCvService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.core.utilities.results.SuccessDataResult;
import system.hrms.dataAccess.abstracts.CandidateCvDao;
import system.hrms.entities.concretes.CandidateCv;
import system.hrms.core.utilities.results.SuccessResult;


@Service
public class CandidateCvManager implements CandidateCvService {

    
    private CandidateCvDao candidateCvDao;

    @Autowired
    public CandidateCvManager(CandidateCvDao candidateCvDao) {
        this.candidateCvDao = candidateCvDao;
    }
    
    @Override
    public Result addCandidateCv(CandidateCv candidateCv) {
        this.candidateCvDao.save(candidateCv);
        return new SuccessResult("Kayıt başarılı.");
    }

    @Override
    public DataResult<List<CandidateCv>> getAllCandidateCv() {
           return new SuccessDataResult<List<CandidateCv>>(this.candidateCvDao.findAll());
    }
    
}
