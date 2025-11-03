package tn.esprit.baligh_laouini_4gamix1.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_4gamix1.Entities.Bloc;
import tn.esprit.baligh_laouini_4gamix1.Entities.Chambre;
import tn.esprit.baligh_laouini_4gamix1.service.BlocService;
import tn.esprit.baligh_laouini_4gamix1.service.ChambreService;

import java.util.List;

@RestController

@AllArgsConstructor
@RequestMapping
public class ChambreController {
    private final ChambreService chambreService;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.ajouterChambre(chambre);
    }

    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.modifierChambre(chambre);
    }

    @DeleteMapping("/deleteChambre/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreService.supprimerChambre(id);
    }
    @GetMapping("/getChambre")
    public List<Chambre> getChambre() {
        return chambreService.getChambres();
    }
}
