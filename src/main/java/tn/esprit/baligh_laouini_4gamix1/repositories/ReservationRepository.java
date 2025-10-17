package tn.esprit.baligh_laouini_4gamix1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.baligh_laouini_4gamix1.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
