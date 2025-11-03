package tn.esprit.baligh_laouini_4gamix1.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_4gamix1.Entities.Universite;
import tn.esprit.baligh_laouini_4gamix1.service.UniversiteService;

import java.util.List;

@RestController

@AllArgsConstructor
@RequestMapping
public class UniversiteController {
    private final UniversiteService universiteService;

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.ajouterUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.modifierUniversite(universite);
    }

    @DeleteMapping("/deleteUniversite/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        universiteService.supprimerUniversite(id);
    }

    @GetMapping("/getUniversites")
    public List<Universite> getUniversites() {
        return universiteService.getUniversites();
    }

}
