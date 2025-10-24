package tn.esprit.baligh_laouini_4gamix1.service;

import tn.esprit.baligh_laouini_4gamix1.Entities.Bloc;

import java.util.List;

public interface BlocService {
    Bloc ajouterBloc(Bloc bloc);
    void supprimerBloc(Long id);
    Bloc getBloc(Long id);
    Bloc modifierBloc(Bloc bloc);
    List<Bloc> getBlocs();
}
