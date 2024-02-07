package monprojet.entity;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Employe {
    @Id
    private Integer matricule;

    @NonNull
    private String nom;

    @Email
    private String email;

    //un employe peut avoir un superieur hierarchique qui est un autre employe
    @ManyToOne(optional = true)
    @JoinColumn(name = "superieur_matricule")
    private Employe superieur;

    @OneToMany(mappedBy = "superieur")
    private List<Employe> subordonnes;

}
