package br.uol.compass.testedesafioengenheirodesoftwareapi.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "PROFISSIONAL")
@Entity
public class Trabalhador implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "PROFISSIONAL_SEQ", sequenceName = "PROFISSIONAL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFISSIONAL_SEQ")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Chamado> chamados;

}
