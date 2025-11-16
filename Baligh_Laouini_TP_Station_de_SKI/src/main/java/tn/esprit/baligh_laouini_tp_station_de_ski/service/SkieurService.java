package tn.esprit.baligh_laouini_tp_station_de_ski.service;

import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Skieur;

import java.util.List;

public interface SkieurService {

    Skieur addSkieur(Skieur skieur);
    void supprimerSkieur(Long id);
    Skieur retrieveSkieur(Long id);
    Skieur modifierSkieur(Skieur skieur);
    List<Skieur> retrieveAllSkieur();

}
