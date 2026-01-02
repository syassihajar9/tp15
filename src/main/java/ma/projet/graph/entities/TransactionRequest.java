package ma.projet.graph.entities;

import lombok.Data;
import java.time.LocalDate;

@Data
public class TransactionRequest {
    private Long compteId;
    private double montant;
    private LocalDate date;         // ou String si tu préfères
    private TypeTransaction type;
}
