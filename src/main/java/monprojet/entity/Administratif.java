package monprojet.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Getter @Setter @ToString @RequiredArgsConstructor @NoArgsConstructor
@Entity
public class Administratif extends Employe {
    @NonNull
    private String diplome;
}
