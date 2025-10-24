package tn.esprit.baligh_laouini_4gamix1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_4gamix1.Entities.Universite;
import tn.esprit.baligh_laouini_4gamix1.repositories.BlocRepository;
import tn.esprit.baligh_laouini_4gamix1.repositories.UniversiteRepository;

import java.util.List;
@AllArgsConstructor

@Service

public class UniversiteServiceImpl implements UniversiteService {

    private final UniversiteRepository universiteRepository;

    @Override
    public Universite ajouterUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void supprimerUniversite(Long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite getUniversite(Long id) {
        return universiteRepository.findById(id).orElseThrow();
    }

    @Override
    public Universite modifierUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getUniversites() {
        return (List<Universite>) universiteRepository.findAll();
    }
}
