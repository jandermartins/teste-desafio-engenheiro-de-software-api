package br.uol.comass.teste.repository;

import br.uol.comass.teste.dto.ChamadoResponseDTO;
import br.uol.comass.teste.entities.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

    @Query("SELECT new br.uol.comass.teste.dto.ChamadoResponseDTO(c.id, c.idCliente, c.dataDeAbertura, c.status) from Chamado c " +
            "WHERE c.dataDeAbertura >= :data group by c.id, c.idCliente, c.dataDeAbertura, c.status")
    List<ChamadoResponseDTO> getByDataDeOntem(@Param("data") LocalDate data);
}
