package br.com.alura.screenmatchfrases;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT frase " +
            " FROM Frase frase " +
            "ORDER BY function('RANDOM') LIMIT 1")
    Frase buscaFraseAleatoria();
}
