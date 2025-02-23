package vn.ptit.project.epl_web.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "coach_club")
@Data
public class CoachClub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="head_coach_id")
    private HeadCoach headCoach;
    @ManyToOne
    @JoinColumn(name="club_id")
    private Club club;
    private LocalDate startDate;
    private LocalDate endDate;
}
