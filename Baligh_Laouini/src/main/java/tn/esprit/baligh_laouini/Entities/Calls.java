package tn.esprit.baligh_laouini.Entities;




import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.aspectj.weaver.ast.Call;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Calls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long callsId;
    private LocalDate callsDateTime;
    private String phoneNumber;
    private Skills requieredSkills;
    private CallStatus status;

    @ManyToOne
    private AISystems assignedAiSystem;
    @OneToMany
    private List<Agents> assignedAgents;
}
