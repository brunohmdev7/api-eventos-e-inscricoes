package br.com.desafioapirestreservasalasalura.apieventoseinscricoes.domain.entity;

import br.com.desafioapirestreservasalasalura.apieventoseinscricoes.domain.enums.StatusRegistro;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Evento evento;

    @Enumerated(EnumType.STRING)
    private StatusRegistro status;

    private Integer posicaoListaEspera;
    private LocalDateTime criadoEm;
}
