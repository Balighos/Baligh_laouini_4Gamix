package tn.esprit.baligh_laouini_4gamix1.Entities;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public enum TypeChambre {

    SIMPLE,
    DOUBLE,
    TRIPLE;

}
