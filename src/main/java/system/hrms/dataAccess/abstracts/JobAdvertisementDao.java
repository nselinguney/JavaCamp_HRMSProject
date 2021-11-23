package system.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import system.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer>{
     
    List<JobAdvertisement> findAllByIsActiveTrue();
    List<JobAdvertisement> findAllByEmployer_IdAndIsActiveTrue(int id);
    List<JobAdvertisement> findAllByOrderByApplicationDeadlineAsc();
    List<JobAdvertisement> findAllByOrderByApplicationDeadlineDesc();
}
