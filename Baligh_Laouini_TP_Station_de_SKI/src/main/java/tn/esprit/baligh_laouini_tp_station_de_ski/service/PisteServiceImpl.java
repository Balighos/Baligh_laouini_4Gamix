package tn.esprit.baligh_laouini_tp_station_de_ski.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Piste;
import tn.esprit.baligh_laouini_tp_station_de_ski.repositories.PisteRepository;

import java.util.List;

@AllArgsConstructor

@Service


public class PisteServiceImpl implements IPisteService {
    private final PisteRepository pisteRepository;

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void supprimerPiste(Long id) {
        pisteRepository.deleteById(id);
    }

    @Override
    public Piste retrievePiste(Long id) {
        return pisteRepository.findById(id).orElseThrow();
    }

    @Override
    public Piste modifierPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }


}
