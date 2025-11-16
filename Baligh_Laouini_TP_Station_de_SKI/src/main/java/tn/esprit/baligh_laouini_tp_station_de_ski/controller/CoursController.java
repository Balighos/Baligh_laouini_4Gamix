package tn.esprit.baligh_laouini_tp_station_de_ski.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Cours;
import tn.esprit.baligh_laouini_tp_station_de_ski.service.CoursServiceImpl;

import java.util.List;

@RestController


@RequestMapping
public class CoursController {

    private final CoursServiceImpl coursService;

    public CoursController(CoursServiceImpl coursService) {
        this.coursService = coursService;
    }

    @PostMapping("/addCours")
    public Cours addCours(@RequestBody Cours cours) {
        return coursService.addCours(cours);
    }

    @PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours cours) {
        return coursService.modifierCours(cours);
    }

    @DeleteMapping("/deleteCours/{id}")
    public void deleteCours(@PathVariable Long id) {
        coursService.supprimerCours(id);
    }

    @GetMapping("/getCours")
    public List<Cours> retrieveAllCours() {
        return coursService.retrieveAllCours();
    }
}
