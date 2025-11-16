package tn.esprit.baligh_laouini_tp_station_de_ski.service;

import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Cours;

import java.util.List;

public interface ICoursService {

    Cours addCours(Cours cours);
    void supprimerCours(Long id);
    Cours retrieveCours(Long id);
    Cours modifierCours(Cours cours);
    List<Cours> retrieveAllCours();
}
