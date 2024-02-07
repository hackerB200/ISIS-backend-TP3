package monprojet.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter @Setter @ToString @RequiredArgsConstructor @NoArgsConstructor
@Entity
public class Participation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String role;

    @NonNull
    private float pourcentage;

    @ManyToOne(optional = false)
    @JoinColumn(name = "employe_matricule")
    private Employe employe;

    @ManyToOne(optional = false)
    @JoinColumn(name = "projet_code")
    private Projet projet;
}
