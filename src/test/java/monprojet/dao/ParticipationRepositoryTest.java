package monprojet.dao;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
@DataJpaTest
class ParticipationRepositoryTest {

    @Autowired
    private ParticipationRepository participationDao;

    @Test
    public void testTotalParticipation() {
        log.info("On peut calculer le pourcentage total de participation d'un employé dans les projets en cours");
        float pourcentageAttendu = 100; //pour l'employé 3
        float pourcentageObtenu = participationDao.pourcentageTotalParticipation(3);
        assertEquals(pourcentageAttendu, pourcentageObtenu);
    }

    @Test
    public void testTotalParticipationZero() {
        log.info("Cet employé n'a pas de participation dans les projets en cours");
        float pourcentageAttendu = 0; //pour l'employé 1
        float pourcentageObtenu = participationDao.pourcentageTotalParticipation(1);
        assertEquals(pourcentageAttendu, pourcentageObtenu);
    }

}
