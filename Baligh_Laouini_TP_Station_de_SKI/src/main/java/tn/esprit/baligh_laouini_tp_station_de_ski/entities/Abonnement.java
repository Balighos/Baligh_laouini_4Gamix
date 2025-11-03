package tn.esprit.baligh_laouini_tp_station_de_ski.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;


@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Abonnement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numAbon;
    LocalDate dateDebut;
    LocalDate dateFin;
    float prixAbon;


}
