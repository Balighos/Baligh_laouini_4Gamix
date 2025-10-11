package tn.esprit.baligh_laouini_4gamix1.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    private List<Bloc> blocs;

    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;

}
