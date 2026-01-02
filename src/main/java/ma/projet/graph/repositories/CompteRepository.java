package ma.projet.graph.repositories;

import ma.projet.graph.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompteRepository extends JpaRepository<Compte, Long> {

    @Query("select sum(c.solde) from Compte c")
    double sumSoldes();
}
