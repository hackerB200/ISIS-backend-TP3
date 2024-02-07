package monprojet.dao;

import monprojet.entity.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ParticipationRepository extends JpaRepository<Participation, Integer> {
    //pour un employé connu par son matricule, calcule son pourcentage total de participation dans les projets en cours
    @Query("SELECT COALESCE(SUM(p.pourcentage), 0) FROM Participation p WHERE p.employe.matricule = :matricule AND p.projet.dateFin IS NULL")
    float pourcentageTotalParticipation(Integer matricule);

}
