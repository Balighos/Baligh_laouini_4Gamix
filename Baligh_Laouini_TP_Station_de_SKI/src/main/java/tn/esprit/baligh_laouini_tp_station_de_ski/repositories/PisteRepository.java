package tn.esprit.baligh_laouini_tp_station_de_ski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste, Long> {
}
