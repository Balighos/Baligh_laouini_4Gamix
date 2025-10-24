package tn.esprit.baligh_laouini_4gamix1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_4gamix1.Entities.Reservation;
import tn.esprit.baligh_laouini_4gamix1.repositories.BlocRepository;
import tn.esprit.baligh_laouini_4gamix1.repositories.ReservationRepository;

import java.util.List;
@AllArgsConstructor

@Service

public class ReservationServiceImpl implements ReservationService{

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation getReservation(Long id) {
        return reservationRepository.findById(id).orElseThrow();
    }

    @Override
    public Reservation modifierReservation(Reservation bloc) {
        return reservationRepository.save(bloc);
    }

    @Override
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }
}
