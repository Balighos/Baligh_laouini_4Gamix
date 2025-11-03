package tn.esprit.baligh_laouini.Entities;




import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Agents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agentsId;
    private String name;
    private Set<Skills> skills;
    private boolean available;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Calls> calls;

    @ManyToMany
    private List<Projects> projects;
}
