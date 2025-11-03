package tn.esprit.baligh_laouini.Repositories;

import org.aspectj.weaver.loadtime.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.baligh_laouini.Entities.Calls;

import java.rmi.Remote;

public interface CallsRepository extends JpaRepository<Calls, Long> {
}
