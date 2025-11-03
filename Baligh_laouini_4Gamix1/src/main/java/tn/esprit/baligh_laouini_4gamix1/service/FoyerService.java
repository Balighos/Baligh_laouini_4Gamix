package tn.esprit.baligh_laouini_4gamix1.service;

import tn.esprit.baligh_laouini_4gamix1.Entities.Bloc;
import tn.esprit.baligh_laouini_4gamix1.Entities.Foyer;

import java.util.List;

public interface FoyerService {

    Foyer ajouterFoyer(Foyer foyer);
    void supprimerFoyer(Long id);
    Foyer getFoyer(Long id);
    Foyer modifierFoyer(Foyer foyer);
    List<Foyer> getFoyer();
}
