package system.hrms.business.abstracts;


import java.util.List;

import system.hrms.core.utilities.results.DataResult;
import system.hrms.core.utilities.results.Result;
import system.hrms.entities.concretes.User;


public interface UserService {

	Result add(User user);
	DataResult<List<User>> getAll();
}
