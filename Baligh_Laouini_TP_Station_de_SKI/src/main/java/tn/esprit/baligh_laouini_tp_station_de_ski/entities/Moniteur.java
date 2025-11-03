package tn.esprit.baligh_laouini_tp_station_de_ski.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;


@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numMoniteur;
    String nomMoniteur;
    String prenomMoniteur;
    LocalDateTime dateRecru;

    @OneToMany
    List<Cours> courses;
}
