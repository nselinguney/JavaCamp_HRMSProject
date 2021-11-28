package system.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.JobAdvertisementService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.core.utilities.results.SuccessDataResult;
import system.hrms.core.utilities.results.SuccessResult;
import system.hrms.dataAccess.abstracts.CityDao;
import system.hrms.dataAccess.abstracts.EmployerDao;
import system.hrms.dataAccess.abstracts.JobAdvertisementDao;
import system.hrms.entities.concretes.JobAdvertisement;
import system.hrms.entities.dtos.JobAdvertisementDto;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private JobAdvertisementDao jobAdvertisementDao;
    private CityDao cityDao;
    private EmployerDao employerDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao, CityDao cityDao, EmployerDao employerDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
        this.cityDao = cityDao;
        this.employerDao = employerDao;
    }
 
    @Override
    public Result add(JobAdvertisementDto jobAdvertisementDto) {

            JobAdvertisement jobAdvertisement = new JobAdvertisement();
            jobAdvertisement.setActive(true);
            jobAdvertisement.setMinSalary(jobAdvertisementDto.getMinSalary());
            jobAdvertisement.setMaxSalary(jobAdvertisementDto.getMaxSalary());
            jobAdvertisement.setDescription(jobAdvertisementDto.getDescription());
            jobAdvertisement.setNumberOfOpenPosition(jobAdvertisementDto.getNumberOfOpenPosition());
            jobAdvertisement.setApplicationDeadline(jobAdvertisementDto.getApplicationDeadline());
            
            jobAdvertisement.setCity(this.cityDao.getCityByCityId(jobAdvertisementDto.getCityId()));
            jobAdvertisement.setEmployer(this.employerDao.getEmployerById(jobAdvertisementDto.getEmployerId()));
            jobAdvertisementDao.save(jobAdvertisement);
            return new SuccessResult("İş ilanı eklendi.");

    }
    
    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"İş ilanları listelendi.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllActives() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAllByIsActiveTrue());
    }

    @Override
    public DataResult<List<JobAdvertisement>> findAllActivesByCompanyId(int id) {
         return new SuccessDataResult<>(this.jobAdvertisementDao.findAllByEmployer_IdAndIsActiveTrue(id));
    }

    @Override
    public DataResult<List<JobAdvertisement>> findAllByOrderByApplicationDeadlineAsc() {
    //  return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAllByOrderByApplicationDeadlineAsc(),
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAllByOrderByApplicationDeadlineAsc(),
                                                                                     "İş ilanları tarihe göre artan sırada listelendi.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> findAllByOrderByApplicationDeadlineDesc() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAllByOrderByApplicationDeadlineDesc(),
                                                                                     "İş ilanları tarihe göre azalan sırada listelendi.");
    }

    
}
