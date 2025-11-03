package tn.esprit.baligh_laouini_tp_station_de_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
}
