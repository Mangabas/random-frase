package br.com.alura.desafio.application.repository;

import br.com.alura.desafio.application.models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Serie, Long> {

    @Query("SELECT s FROM Serie s order by function('RANDOM') LIMIT 1")
    Serie fraseAleatoria();

}
