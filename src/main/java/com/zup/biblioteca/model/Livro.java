package com.zup.biblioteca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Date dataLancamento;

    protected Livro() {}

    public Livro(String nome, Date dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
    }
}
