package br.uol.comass.teste.entities;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

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
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @Column(name = "idCliente")
    private String idCliente;

    @Column(name = "dataDeAbertura")
    private LocalDate dataDeAbertura;

    @Column(name = "status")
    private String status;

}
