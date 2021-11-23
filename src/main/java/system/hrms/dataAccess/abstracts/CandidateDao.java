package system.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import system.hrms.entities.concretes.Candidate;


public interface CandidateDao extends JpaRepository<Candidate,Integer> {
	boolean existsByEmail(String email);
	
}
