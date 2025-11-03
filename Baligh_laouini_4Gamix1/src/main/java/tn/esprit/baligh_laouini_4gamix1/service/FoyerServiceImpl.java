package tn.esprit.baligh_laouini_4gamix1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_4gamix1.Entities.Foyer;
import tn.esprit.baligh_laouini_4gamix1.repositories.BlocRepository;
import tn.esprit.baligh_laouini_4gamix1.repositories.FoyerRepository;

import java.util.List;
@AllArgsConstructor

@Service

public class FoyerServiceImpl implements FoyerService {

    private final FoyerRepository foyerRepository;

    @Override
    public Foyer ajouterFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void supprimerFoyer(Long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public Foyer getFoyer(Long id) {
        return foyerRepository.findById(id).orElseThrow();
    }

    @Override
    public Foyer modifierFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> getFoyer() {
        return foyerRepository.findAll();
    }
}
