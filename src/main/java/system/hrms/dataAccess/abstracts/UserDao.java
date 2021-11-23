package system.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import system.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
}