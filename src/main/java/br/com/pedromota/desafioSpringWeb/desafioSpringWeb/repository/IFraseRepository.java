package br.com.pedromota.desafioSpringWeb.desafioSpringWeb.repository;

import br.com.pedromota.desafioSpringWeb.desafioSpringWeb.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IFraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f ORDER BY function('random') LIMIT 1")
    Frase buscaFraseAleatoria();
}
