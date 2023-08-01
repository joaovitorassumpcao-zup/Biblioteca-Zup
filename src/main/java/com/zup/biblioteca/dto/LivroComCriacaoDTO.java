package com.zup.biblioteca.dto;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LivroComCriacaoDTO implements Serializable {

    private Long id;

    @NotEmpty(message = "Preechimento Obrigatório")
    @Length(min = 1, max = 50)
    private String nome;

    @NotEmpty(message = "Preechimento Obrigatório")
    private String autor;

    @NotEmpty(message = "Preechimento Obrigatório")
    private Date dataLancamento;

    @CreationTimestamp
    private Timestamp dataCriacao;
}
