package tn.esprit.baligh_laouini_tp_station_de_ski.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Skieur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numSkieur;



    String  nomS;
    String  prenomS;
    LocalDate dateNaissance;
    String ville;

    @ManyToMany
    List<Piste> pistes;

    @OneToMany(mappedBy = "skieur")
    List<Inscription> inscriptions;

    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement;


}
