package tn.esprit.baligh_laouini_4gamix1.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
@Builder

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idFoyer;

     String nomFoyer;
     Long capaciteFoyer;

    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
     List<Bloc> blocs;

    @OneToOne

     Universite universite;

}
