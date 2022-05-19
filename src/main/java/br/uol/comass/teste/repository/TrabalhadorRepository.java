package br.uol.comass.teste.repository;

import br.uol.comass.teste.dto.TrabalhadorResponseDTO;
import br.uol.comass.teste.entities.Trabalhador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrabalhadorRepository extends JpaRepository<Trabalhador, Long> {

    @Query("SELECT new br.uol.comass.teste.dto.TrabalhadorResponseDTO(t.id, t.nome) FROM Trabalhador t " +
            "GROUP BY t.id, t.nome")
    List<TrabalhadorResponseDTO> findAllTrabalhadores();
}