package br.uol.comass.teste.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class TrabalhadorResponseDTO implements Serializable {

    private Long id;
    private String nome;

    public TrabalhadorResponseDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
