import java.time.Instant;

public class Enseignants extends Individu {
    private String specialite;

    public Enseignants(int id, String nom, String prenom, Instant dateNaissance, String email, int numeroTelephone,  String specialite) {
        super(id, nom, prenom, dateNaissance, email, numeroTelephone);
        this.specialite = specialite;
    }
}
