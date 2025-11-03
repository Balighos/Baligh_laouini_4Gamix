package tn.esprit.baligh_laouini_4gamix1.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_4gamix1.Entities.Etudiant;
import tn.esprit.baligh_laouini_4gamix1.service.EtudiantService;

import java.util.List;

@RestController

@AllArgsConstructor
@RequestMapping
public class EtudiantController {

    private final EtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.ajouterEtudiant(etudiant);
    }

    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.modifierEtudiant(etudiant);
    }

    @DeleteMapping("/deleteEtudiant/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantService.supprimerEtudiant(id);
    }
    @GetMapping("/getEtudiant")
    public List<Etudiant> getEtudiant() {
        return etudiantService.getEtudiants();
    }
}
