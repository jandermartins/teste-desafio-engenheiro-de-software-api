package br.uol.compass.testedesafioengenheirodesoftwareapi.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Builder
public class ChamadoComTrabalhadorAtribuidoDTO implements Serializable {

    private Long id;
    private LocalDate dataDeAbertura;
    private String nome;

    public ChamadoComTrabalhadorAtribuidoDTO(Long id, LocalDate dataDeAbertura, String nome) {
        this.id = id;
        this.dataDeAbertura = dataDeAbertura;
        this.nome = nome;
    }
}
