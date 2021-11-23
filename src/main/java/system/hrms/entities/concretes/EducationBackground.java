package system.hrms.entities.concretes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="education_backgrounds")
public class EducationBackground {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="education_bacground_id")
    private int educationBackgroundId;
    
    @ManyToOne()
    @JoinColumn(name="department_id")
    private Department department;
    
    @ManyToOne()
    @JoinColumn(name="school_id")
    private School school;
    
    @Column(name="school_start_date")
    private Date schoolStartDate;
    
    @Column(name="school_finish_date")
    private Date schoolFinishDate;
    
    @Column(name="is_continue")
    private boolean isContinue;
    
    @ManyToOne()
    @JoinColumn(name="candidate_id")
    private Candidate candidate;
    
    @OneToOne()
    @JoinColumn(name="candidate_cv_id")
    private CandidateCv candidateCv;

}
