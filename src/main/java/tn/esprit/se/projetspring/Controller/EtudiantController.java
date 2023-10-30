package tn.esprit.se.projetspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.se.projetspring.Entity.Etudiant;
import tn.esprit.se.projetspring.Interfaces.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiant() {
        return etudiantService.retrieveAllEtudiants();
    }

}
