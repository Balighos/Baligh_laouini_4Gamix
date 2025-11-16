package tn.esprit.baligh_laouini_tp_station_de_ski.controller;


import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Moniteur;
import tn.esprit.baligh_laouini_tp_station_de_ski.service.MoniteurServiceImpl;

import java.util.List;

@RestController

@RequestMapping
public class MoniteurController {

    private final MoniteurServiceImpl moniteurService;

    public MoniteurController(MoniteurServiceImpl moniteurService) {
        this.moniteurService = moniteurService;
    }

    @PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.addMoniteur(moniteur);
    }

    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur) {
        return moniteurService.modifierMoniteur(moniteur);
    }

    @DeleteMapping("/deleteMoniteur/{id}")
    public void deleteMoniteur(@PathVariable Long id) {
        moniteurService.supprimerMoniteur(id);
    }

    @GetMapping("/getMoniteurs")
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurService.retrieveAllMoniteur();
    }


}
