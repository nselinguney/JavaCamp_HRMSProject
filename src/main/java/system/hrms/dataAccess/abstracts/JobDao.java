package system.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import system.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}