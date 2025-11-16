package tn.esprit.baligh_laouini_tp_station_de_ski.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Cours;
import tn.esprit.baligh_laouini_tp_station_de_ski.repositories.CoursRepository;
import tn.esprit.baligh_laouini_tp_station_de_ski.repositories.PisteRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class CoursServiceImpl implements ICoursService {

    private final CoursRepository coursRepository;


    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public void supprimerCours(Long id) {
        coursRepository.deleteById(id);
    }

    @Override
    public Cours retrieveCours(Long id) {
        return coursRepository.findById(id).orElseThrow();
    }

    @Override
    public Cours modifierCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepository.findAll();
    }
}
