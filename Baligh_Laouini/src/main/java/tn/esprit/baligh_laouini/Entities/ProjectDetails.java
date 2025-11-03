package tn.esprit.baligh_laouini.Entities;



import com.sun.jdi.PrimitiveValue;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detailsId;
    private double budget;
    private String client;


    @OneToOne
    private Projects project;
}
