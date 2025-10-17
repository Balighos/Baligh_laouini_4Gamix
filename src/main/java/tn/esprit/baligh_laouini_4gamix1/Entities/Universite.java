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


public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idUniversite;

     String nomUniversite;

     String address;

    @OneToOne(mappedBy = "universite")
     Foyer foyers;
}
