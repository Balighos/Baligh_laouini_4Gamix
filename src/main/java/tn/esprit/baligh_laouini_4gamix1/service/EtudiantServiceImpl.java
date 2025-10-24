package tn.esprit.baligh_laouini_4gamix1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_4gamix1.Entities.Etudiant;
import tn.esprit.baligh_laouini_4gamix1.repositories.BlocRepository;
import tn.esprit.baligh_laouini_4gamix1.repositories.EtudiantRepository;

import java.util.List;
@AllArgsConstructor

@Service

public class EtudiantServiceImpl implements  EtudiantService{


    private final EtudiantRepository etudiantRepository;
    @Override
    public Etudiant ajouterEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void supprimerEtudiant(Long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public Etudiant getEtudiant(Long id) {
        return etudiantRepository.findById(id).orElseThrow();
    }

    @Override
    public Etudiant modifierEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getEtudiant() {
        return etudiantRepository.findAll();
    }
}
