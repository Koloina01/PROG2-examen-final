import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class Examens {
    private int id;
    private String title;
    private Cours coursRattache;
    private Instant dateEtHeureExamen;
    private int coefficient;
}
