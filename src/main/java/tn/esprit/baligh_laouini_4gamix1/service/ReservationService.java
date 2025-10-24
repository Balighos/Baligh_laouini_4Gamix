package tn.esprit.baligh_laouini_4gamix1.service;

import tn.esprit.baligh_laouini_4gamix1.Entities.Bloc;
import tn.esprit.baligh_laouini_4gamix1.Entities.Reservation;

import java.util.List;

public interface ReservationService {


    Reservation ajouterReservation(Reservation reservation);
    void supprimerReservation(Long id);
    Reservation getReservation(Long id);
    Reservation modifierReservation(Reservation bloc);
    List<Reservation> getReservations();
}
