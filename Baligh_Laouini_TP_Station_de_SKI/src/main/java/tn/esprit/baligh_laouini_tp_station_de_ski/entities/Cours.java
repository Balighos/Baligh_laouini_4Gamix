package tn.esprit.baligh_laouini_tp_station_de_ski.entities;


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



public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numCours;
    int niveau;
    TypeCours typeCours;
    Support support;
    float prix;
    int creneau;

    @OneToMany(mappedBy = "cours")
    List<Inscription> inscriptions;


}
