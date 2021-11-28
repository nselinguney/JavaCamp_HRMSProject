package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.CandidateCv;

public interface CandidateCvService {
    Result addCandidateCv(CandidateCv candidateCv);
    DataResult<List<CandidateCv>> getAllCandidateCv();
}
