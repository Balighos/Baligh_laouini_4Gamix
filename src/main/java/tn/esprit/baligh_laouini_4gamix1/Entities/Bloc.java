package tn.esprit.baligh_laouini_4gamix1.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.List;
@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idBloc;

    String nomBloc;
    Long capaciteBloc;

    @ManyToOne
    @JoinColumn(name = "foyer_id")
    Foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    List<Chambre> chambres;


}
