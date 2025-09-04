import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
public class Etudiants extends Individu{
    private String groupe;
    private String tuteur;

    public Etudiants(int id, String nom, String prenom, Instant dateNaissance, String email, int numeroTelephone, String groupe, String tuteur) {
        super(id, nom, prenom, dateNaissance, email, numeroTelephone);
        this.groupe = nom;
        this.tuteur = prenom;
    }
}
