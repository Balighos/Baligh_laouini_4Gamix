package tn.esprit.baligh_laouini.Entities;




import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AISystems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aiSystemId;
    private String type;
    private boolean available;
    private Set<Skills> skills;
    @ManyToOne(cascade = CascadeType.ALL)
    Calls calls;
}
