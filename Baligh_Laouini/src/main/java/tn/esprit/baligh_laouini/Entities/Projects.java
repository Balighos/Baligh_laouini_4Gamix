package tn.esprit.baligh_laouini.Entities;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ProjectsId;
    private String libelle;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToMany
    private List<Agents> agents;

    @OneToOne
    private ProjectDetails projectDetails;
}
