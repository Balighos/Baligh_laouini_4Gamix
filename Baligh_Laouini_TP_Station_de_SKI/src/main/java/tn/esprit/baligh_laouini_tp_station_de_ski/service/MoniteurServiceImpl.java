package tn.esprit.baligh_laouini_tp_station_de_ski.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Moniteur;
import tn.esprit.baligh_laouini_tp_station_de_ski.repositories.MoniteurRepository;

import java.util.List;


@AllArgsConstructor
@Service
public class MoniteurServiceImpl implements IMoniteurService {

    private final MoniteurRepository moniteurRepository;

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public void supprimerMoniteur(Long id) {
        moniteurRepository.deleteById(id);
    }

    @Override
    public Moniteur retrieveMoniteur(Long id) {
        return moniteurRepository.findById(id).orElseThrow();
    }

    @Override
    public Moniteur modifierMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public List<Moniteur> retrieveAllMoniteur() {
        return moniteurRepository.findAll();
    }
}
