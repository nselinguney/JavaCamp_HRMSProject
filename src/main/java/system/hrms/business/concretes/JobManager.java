package system.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.hrms.business.abstracts.JobService;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.core.utilities.results.SuccessDataResult;
import system.hrms.core.utilities.results.SuccessResult;
import system.hrms.dataAccess.abstracts.JobDao;
import system.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao jobDao;

        public JobManager() {
            super();
        }

	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Kullanıcılar listelendi.");
	}

	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return new SuccessResult("Meslek eklendi");
	}
}
