package tn.esprit.baligh_laouini.Repositories;

import org.aspectj.weaver.loadtime.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.baligh_laouini.Entities.Projects;

import java.rmi.Remote;

public interface ProjectsRepository extends JpaRepository<Projects, Long> {
}
