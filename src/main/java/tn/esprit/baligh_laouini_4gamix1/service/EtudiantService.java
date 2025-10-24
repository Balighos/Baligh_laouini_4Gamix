package tn.esprit.baligh_laouini_4gamix1.service;

import tn.esprit.baligh_laouini_4gamix1.Entities.Bloc;
import tn.esprit.baligh_laouini_4gamix1.Entities.Etudiant;

import java.util.List;

public interface EtudiantService {
    Etudiant ajouterEtudiant(Etudiant etudiant);
    void supprimerEtudiant(Long id);
    Etudiant getEtudiant(Long id);
    Etudiant modifierEtudiant(Etudiant etudiant);
    List<Etudiant> getEtudiant();
}
