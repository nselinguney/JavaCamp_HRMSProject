package system.hrms.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="skills")
public class Skill {
    
    @Id
    @GeneratedValue
    @Column(name="skill_id")
    private int skillId;
    
    @Column(name="name")
    private String name;
    
    @Column(name="framework")
    private String framework;
    
    //burayı anlamadım - SOR!
    @ManyToMany()
    @JoinColumn(name="candidate_id")
    private List<Candidate> candidates;
    
    @OneToOne()
    @JoinColumn(name="candidate_cv_id")
    private CandidateCv candidateCv;
}
