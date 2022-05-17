package br.uol.compass.testedesafioengenheirodesoftwareapi.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class ChamadoResponseDTO implements Serializable {


    private Long id;
    private String idCliente;
    private LocalDate dataDeAbertura;
    private String status;

    public ChamadoResponseDTO(Long id, String idCliente, LocalDate dataDeAbertura, String status) {
        this.id = id;
        this.idCliente = idCliente;
        this.dataDeAbertura = dataDeAbertura;
        this.status = status;

    }
}
