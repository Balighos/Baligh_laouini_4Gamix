package tn.esprit.baligh_laouini_4gamix1.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.baligh_laouini_4gamix1.Entities.Bloc;
import tn.esprit.baligh_laouini_4gamix1.service.BlocService;

import java.util.List;

@RestController

@AllArgsConstructor
@RequestMapping
public class BlocController {

    private final BlocService blocService;

    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.ajouterBloc(bloc);
    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.modifierBloc(bloc);
    }

    @DeleteMapping("/deleteBloc/{id}")
    public void deleteBloc(@PathVariable Long id) {
        blocService.supprimerBloc(id);
    }
    @GetMapping("/getBloc")
    public List<Bloc> getBloc() {
        return blocService.getBlocs();
    }

}
