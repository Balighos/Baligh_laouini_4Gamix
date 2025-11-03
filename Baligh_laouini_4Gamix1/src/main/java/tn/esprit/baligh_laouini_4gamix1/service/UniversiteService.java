package tn.esprit.baligh_laouini_4gamix1.service;

import tn.esprit.baligh_laouini_4gamix1.Entities.Bloc;
import tn.esprit.baligh_laouini_4gamix1.Entities.Universite;

import java.util.List;

public interface UniversiteService {

    Universite ajouterUniversite(Universite universite);
    void supprimerUniversite(Long id);
    Universite getUniversite(Long id);
    Universite modifierUniversite(Universite universite);
    List<Universite> getUniversites();
}
