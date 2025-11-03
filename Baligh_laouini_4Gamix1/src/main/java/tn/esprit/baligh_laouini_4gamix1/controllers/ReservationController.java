package tn.esprit.baligh_laouini_4gamix1.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_4gamix1.Entities.Reservation;
import tn.esprit.baligh_laouini_4gamix1.service.ReservationService;

import java.util.List;

@RestController

@AllArgsConstructor
@RequestMapping
public class ReservationController {
    private final ReservationService reservationService;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @PutMapping("/updateReservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.modifierReservation(reservation);
    }

    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.supprimerReservation(id);
    }

    @GetMapping("/getReservations")
    public List<Reservation> getReservations() {
        return reservationService.getReservations();
    }
}
