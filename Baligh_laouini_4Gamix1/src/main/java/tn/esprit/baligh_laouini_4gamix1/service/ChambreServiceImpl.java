package tn.esprit.baligh_laouini_4gamix1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.baligh_laouini_4gamix1.Entities.Chambre;
import tn.esprit.baligh_laouini_4gamix1.repositories.BlocRepository;
import tn.esprit.baligh_laouini_4gamix1.repositories.ChambreRepository;

import java.util.List;

@AllArgsConstructor

@Service

public class ChambreServiceImpl implements ChambreService {

    private final ChambreRepository chambreRepository;

    @Override
    public Chambre ajouterChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void supprimerChambre(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre getChambre(Long id) {
        return chambreRepository.findById(id).orElseThrow();
    }

    @Override
    public Chambre modifierChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getChambres() {
        return chambreRepository.findAll();
    }
}
