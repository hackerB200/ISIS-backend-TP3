package monprojet.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter @Setter @ToString @RequiredArgsConstructor @NoArgsConstructor
@Entity
public class Projet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @NonNull
    private String nom;

    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_debut")
    private LocalDate dateDebut;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_fin")
    private LocalDate dateFin;
}
