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


public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idChambre;

    Long numeroChambre;

    @Enumerated(EnumType.STRING)
    TypeChambre typeC;

    @ManyToOne
    @JoinColumn(name = "bloc_id")
    Bloc bloc;

    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
    List<Reservation> reservations;
}
