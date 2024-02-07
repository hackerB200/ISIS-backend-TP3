package monprojet.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter @Setter @ToString @RequiredArgsConstructor @NoArgsConstructor
@Entity
public class Commercial extends Employe {
    @NonNull
    private float pourcentage;
}
