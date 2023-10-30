package tn.esprit.se.projetspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.projetspring.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {


}