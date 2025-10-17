package tn.esprit.baligh_laouini_4gamix1.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;
@Builder

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idReservation;

    @Temporal(TemporalType.DATE)
     Date anneeUniversitaire;

     boolean estValide;

    @ManyToOne
    @JoinColumn(name = "chambre_id")
     Chambre chambre;

    @ManyToMany
    @JoinTable(
            name = "reservation_etudiant",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
    )
     List<Etudiant> etudiants;

}
