
package system.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import system.hrms.entities.concretes.CandidateCv;

public interface CandidateCvDao extends JpaRepository<CandidateCv,Integer> {
    
}
