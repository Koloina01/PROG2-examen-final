import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Examen {
    private int id;
    private String title;
    private Cours coursRattache;
    private Instant dateEtHeureExamen;
    private int coefficient;
    private List<Notes> notes;

    public double getExamGrade(Examen examen, Etudiant etudiant, Instant t) {
        for(Notes note : this.notes) {
            if(note.getEtudiant().equals(etudiant)) {

            }
        }
    }

}
