package br.uol.compass.testedesafioengenheirodesoftwareapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "CLIENTE_SEQ", sequenceName = "CLIENTE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENTE_SEQ")
    private Long id;

    @Column(name = "NOME", nullable = false, unique = true)
    private String nome;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Chamado> chamados;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
