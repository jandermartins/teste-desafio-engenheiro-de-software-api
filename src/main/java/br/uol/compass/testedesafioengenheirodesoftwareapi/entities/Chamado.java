package br.uol.compass.testedesafioengenheirodesoftwareapi.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "CHAMADO")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Chamado implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "CHAMADO_SEQ", sequenceName = "CHAMADO_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CHAMADO_SEQ")
    private Long id;

    @Column(name = "idCliente")
    private String idCliente;

    @Column(name = "dataDeAbertura")
    private LocalDate dataDeAbertura;

    @Column(name = "status")
    private String status;

}
