package tn.esprit.baligh_laouini_4gamix1.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_4gamix1.Entities.Foyer;
import tn.esprit.baligh_laouini_4gamix1.service.FoyerService;

import java.util.List;

@RestController

@AllArgsConstructor
@RequestMapping
public class FoyerController {
    private final FoyerService foyerService;

    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.ajouterFoyer(foyer);
    }

    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.modifierFoyer(foyer);
    }

    @DeleteMapping("/deleteFoyer/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        foyerService.supprimerFoyer(id);
    }

    @GetMapping("/getFoyers")
    public List<Foyer> getFoyers() {
        return foyerService.getFoyer();
    }
}
