package tn.esprit.baligh_laouini_4gamix1.service;

import tn.esprit.baligh_laouini_4gamix1.Entities.Bloc;
import tn.esprit.baligh_laouini_4gamix1.Entities.Chambre;

import java.util.List;

public interface ChambreService {

    Chambre ajouterChambre(Chambre chambre);
    void supprimerChambre(Long id);
    Chambre getChambre(Long id);
    Chambre modifierChambre(Chambre chambre);
    List<Chambre> getChambres();
}
