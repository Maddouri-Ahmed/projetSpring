package tn.esprit.se.projetspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.se.projetspring.Entity.Bloc;
import tn.esprit.se.projetspring.Entity.Chambre;
import tn.esprit.se.projetspring.Entity.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {

    List<Chambre> findByBlocAndTypeChambre(Bloc blocs, TypeChambre typeChambre);

    List<Chambre> findByEstValide(boolean estValide);

    List<Chambre> findByBlocAndCapaciteGreaterThan(Bloc blocs, int capaciteMinimale);

}
