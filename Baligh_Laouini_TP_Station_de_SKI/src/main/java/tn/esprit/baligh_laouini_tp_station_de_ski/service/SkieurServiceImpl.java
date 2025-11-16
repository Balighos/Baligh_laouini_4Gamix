package tn.esprit.baligh_laouini_tp_station_de_ski.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Skieur;
import tn.esprit.baligh_laouini_tp_station_de_ski.repositories.SkieurRepository;

import java.util.List;


@AllArgsConstructor
@Service
public class SkieurServiceImpl implements SkieurService {

    private final SkieurRepository skieurRepository;

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void supprimerSkieur(Long id) {
        skieurRepository.deleteById(id);
    }

    @Override
    public Skieur retrieveSkieur(Long id) {
        return skieurRepository.findById(id).orElseThrow();
    }

    @Override
    public Skieur modifierSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> retrieveAllSkieur() {
        return skieurRepository.findAll();
    }
}
