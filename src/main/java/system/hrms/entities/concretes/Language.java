package system.hrms.entities.concretes;

import com.sun.istack.NotNull;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="languages")
public class Language {
   
    @Id
    @GeneratedValue
    @Column(name="langguage_id")
    private int languageId;

    @Column(name="name")
    private String name;
    
    @NotNull
    @Column(name="language_level")
    private int languageLevel;

    @ManyToMany()
    @JoinColumn(name="candidate_id")
    private List<Candidate> candidates;
}
