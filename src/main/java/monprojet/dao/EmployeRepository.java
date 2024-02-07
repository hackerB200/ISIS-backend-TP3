package monprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import monprojet.entity.Employe;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {

    /**
     * Trouve un employé par son nom.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param nomDeLemploye
     * @return L'employe correspondant au nom fourni, ou null si pas trouvé.
     */
    Employe findByNom(String nomDeLemploye);

//    @Query("SELECT e FROM Employe e WHERE e.superieur.matricule = :matricule")
    List<Employe> findSubordonnesBySuperieurMatricule(Integer matricule);

}
