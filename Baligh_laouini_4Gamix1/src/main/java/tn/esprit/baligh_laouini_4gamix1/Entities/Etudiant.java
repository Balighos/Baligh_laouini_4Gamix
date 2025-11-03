package tn.esprit.baligh_laouini_4gamix1.Entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
@Builder

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idEtudiant;

     String nomEt;
     String prenomEt;
     Long cin;
     String ecole;

    @Temporal(TemporalType.DATE)
     Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants")
     List<Reservation> reservations;

}
