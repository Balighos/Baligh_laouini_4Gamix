package tn.esprit.baligh_laouini_tp_station_de_ski.service;

import tn.esprit.baligh_laouini_tp_station_de_ski.entities.Piste;

import java.util.List;

public interface IPisteService {

    Piste addPiste(Piste piste);
    void supprimerPiste(Long id);
    Piste retrievePiste(Long id);
    Piste modifierPiste(Piste piste);
    List<Piste> retrieveAllPistes();

}
