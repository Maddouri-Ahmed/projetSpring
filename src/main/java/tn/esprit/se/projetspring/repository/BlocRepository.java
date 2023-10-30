package tn.esprit.se.projetspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.projetspring.Entity.Bloc;
import tn.esprit.se.projetspring.Entity.Universite;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
    List<Bloc> findByUniversite(Universite universite);
}