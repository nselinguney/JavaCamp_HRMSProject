package system.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import system.hrms.entities.concretes.Employer;

@Repository
public interface EmployerDao extends JpaRepository<Employer,Integer>{
	boolean existsByEmail(String email);
        Employer getEmployerById(int id);
}