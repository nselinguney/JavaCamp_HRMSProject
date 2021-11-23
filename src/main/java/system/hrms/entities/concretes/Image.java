package system.hrms.entities.concretes;

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


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="images")
public class Image {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="image_id")
    private int image_id;


    @Column(name="image_link")
    private String imageLink;

    @Column(name="uploaded_date")
    private String uploadedDate;

    @ManyToOne()
    @JoinColumn(name="candidate_id")
    private Candidate candidate;

    @OneToOne()
    @JoinColumn(name="candidate_cv_id")
    private CandidateCv candidateCv;
}
