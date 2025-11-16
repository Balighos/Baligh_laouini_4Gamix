package tn.esprit.baligh_laouini_tp_station_de_ski.service;

import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Moniteur;

import java.util.List;

public interface IMoniteurService  {

    Moniteur addMoniteur(Moniteur moniteur);
    void supprimerMoniteur(Long id);
    Moniteur retrieveMoniteur(Long id);
    Moniteur modifierMoniteur(Moniteur moniteur);
    List<Moniteur> retrieveAllMoniteur();
}