package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.JobAdvertisement;
import system.hrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService {
    Result add(JobAdvertisementDto jobAdvertisementDto);
    DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getAllActives();
    DataResult<List<JobAdvertisement>> findAllActivesByCompanyId(int id);
    DataResult<List<JobAdvertisement>> findAllByOrderByApplicationDeadlineAsc();
    DataResult<List<JobAdvertisement>> findAllByOrderByApplicationDeadlineDesc();
}
