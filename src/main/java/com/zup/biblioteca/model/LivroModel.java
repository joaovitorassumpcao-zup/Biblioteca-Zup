package com.zup.biblioteca.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_LIVROS")
public class LivroModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(length = 50, nullable = false)
    private String autor;

    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataLancamento;

}
