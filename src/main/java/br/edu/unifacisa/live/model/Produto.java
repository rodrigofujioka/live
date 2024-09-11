package br.edu.unifacisa.live.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Produto {

    @Id
    private Long codigo;
    private String nome;
    private Double valor;

}
