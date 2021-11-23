package system.hrms.entities.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementDto {
    
    private int id;
    private int cityId;
    private int employerId;
    private String description;
    private String city;
    private int minSalary;
    private int maxSalary;
    private Date applicationDeadline;
    private int numberOfOpenPosition;
    private boolean isActive;
    
}
