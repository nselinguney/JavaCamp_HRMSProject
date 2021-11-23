package system.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import system.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image,Integer> {
}
