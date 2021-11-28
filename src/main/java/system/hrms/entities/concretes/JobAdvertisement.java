package system.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_advertisements")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class JobAdvertisement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
     
    @Column(name = "description")
    private String description;
    
    @Column(name = "min_salary")
    private int minSalary;

    @Column(name = "max_salary")
    private int maxSalary;
    
    @Column(name = "application_deadline")
    private Date applicationDeadline;
    
    @Column(name = "number_of_open_position")
    private int numberOfOpenPosition;
    
    @Column(name = "release_date")
    private LocalDate releaseDate;
    
    @Column(name = "is_active")
    private boolean isActive;
    
    @ManyToOne
    @JoinColumn(name = "employer_id")
    private Employer employer;
   
    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;
    
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
}
