package tn.esprit.baligh_laouini_4gamix1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_4gamix1.Entities.Bloc;
import tn.esprit.baligh_laouini_4gamix1.repositories.BlocRepository;

import java.util.List;

@AllArgsConstructor

@Service

public class BlocServiceImpl implements BlocService{

    private final BlocRepository blocRepository;

    @Override
    public Bloc ajouterBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void supprimerBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc getBloc(Long id) {
        return blocRepository.findById(id).orElseThrow();
    }

    @Override
    public Bloc modifierBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }




    @Override
    public List<Bloc> getBlocs() {
        return blocRepository.findAll();
    }
}
