package tn.esprit.baligh_laouini_tp_station_de_ski.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Skieur;
import tn.esprit.baligh_laouini_tp_station_de_ski.service.SkieurServiceImpl;

import java.util.List;

@RestController


@RequestMapping
public class SkieurController {

    private final SkieurServiceImpl skieurService;

    public SkieurController(SkieurServiceImpl skieurService) {
        this.skieurService = skieurService;
    }

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        return skieurService.addSkieur(skieur);
    }

    @PutMapping("/updateSkieur")
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return skieurService.modifierSkieur(skieur);
    }

    @DeleteMapping("/deleteSkieur/{id}")
    public void deleteSkieur(@PathVariable Long id) {
        skieurService.supprimerSkieur(id);
    }

    @GetMapping("/getSkieurs")
    public List<Skieur> retrieveAllSkieurs() {
        return skieurService.retrieveAllSkieur();
    }
}
