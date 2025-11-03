package tn.esprit.baligh_laouini.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.baligh_laouini.Entities.AISystems;

import java.rmi.Remote;

public interface AISystemsRepository extends JpaRepository<AISystems, Long> {
}
