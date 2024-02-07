package monprojet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Getter @Setter @ToString @RequiredArgsConstructor @NoArgsConstructor
@Entity
public class Technique extends Employe {
    @NonNull
    @Column(name = "montant_prime")
    private float montantPrime;
}
