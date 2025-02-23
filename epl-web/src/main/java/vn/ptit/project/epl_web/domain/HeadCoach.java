package vn.ptit.project.epl_web.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "head_coaches")
@Data
public class HeadCoach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private LocalDateTime dob;
    @ElementCollection
    @CollectionTable(name = "coach_citizenship", joinColumns = @JoinColumn(name = "head_coach_id"))
    @Column(name = "citizenship")
    private Set<String> citizenships;
    @OneToMany(mappedBy = "headCoach",cascade = CascadeType.ALL)
    private Set<CoachClub> coachClubs;

}
