package tn.esprit.baligh_laouini_tp_station_de_ski.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numInscription;
    int numSemaine;

    @ManyToOne
    Skieur skieur;
    @ManyToOne
    Cours cours;
}
