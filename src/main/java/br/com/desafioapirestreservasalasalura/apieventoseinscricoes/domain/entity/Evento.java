package br.com.desafioapirestreservasalasalura.apieventoseinscricoes.domain.entity;

import br.com.desafioapirestreservasalasalura.apieventoseinscricoes.domain.enums.StatusEvento;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Integer vagasTotais;
    private Integer vagasPreenchidas;

    @Enumerated(EnumType.STRING)
    private StatusEvento status;

    @OneToMany
    private List<Registro> registros;
}
