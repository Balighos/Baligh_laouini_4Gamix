package tn.esprit.baligh_laouini_tp_station_de_ski.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Piste;
import tn.esprit.baligh_laouini_tp_station_de_ski.service.PisteServiceImpl;

import java.util.List;

@RestController

@AllArgsConstructor
@RequestMapping
public class PisteController {
    private final PisteServiceImpl pisteService;



    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }


    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteService.modifierPiste(piste);
    }

    @DeleteMapping("/deletePiste/{id}")
    public void deletePiste(@PathVariable Long id) {
        pisteService.supprimerPiste(id);
    }


    @GetMapping("/getPistes")
    public List<Piste> retrieveAllPistes() {
        return pisteService.retrieveAllPistes();
    }


}
