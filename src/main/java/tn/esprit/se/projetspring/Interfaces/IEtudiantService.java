package tn.esprit.se.projetspring.Interfaces;

import tn.esprit.se.projetspring.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Long idEtudiant);

    void removeEtudiant(Long idEtudiant);
}
