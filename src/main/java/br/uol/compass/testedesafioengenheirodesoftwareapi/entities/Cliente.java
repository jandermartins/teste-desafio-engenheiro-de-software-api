package br.uol.compass.testedesafioengenheirodesoftwareapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

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
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
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
