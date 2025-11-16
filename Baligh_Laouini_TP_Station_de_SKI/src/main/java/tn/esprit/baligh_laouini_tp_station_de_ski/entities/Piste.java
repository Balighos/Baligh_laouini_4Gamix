package tn.esprit.baligh_laouini_tp_station_de_ski.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numPiste;
    String nomPiste;


    @Enumerated(EnumType.STRING)
    Couleur couleur;

    int longueur;
    int pente;

    @ManyToMany(mappedBy = "pistes")
    List<Skieur> skieurs;

}
