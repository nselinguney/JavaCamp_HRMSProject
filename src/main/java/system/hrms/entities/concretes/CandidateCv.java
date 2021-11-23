/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system.hrms.entities.concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidate_cvs")
public class CandidateCv {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="candidate_cv_id")
    private int candidateCvId;
    
    @OneToOne()
    @JoinColumn(name="candidate_id")
    private Candidate candidate;
    
    @OneToMany(mappedBy="candidateCv")
    private List<Skill> skills;
    
    @OneToMany(mappedBy="candidateCv")
    private List<EducationBackground> educationBackgrounds;

    @OneToMany(mappedBy="candidateCv")
    private List<JobExperience> jobExperiences;

    @OneToOne(mappedBy="candidateCv")
    private Image image;
    
}
