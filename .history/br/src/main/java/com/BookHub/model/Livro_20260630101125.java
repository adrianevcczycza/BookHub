package com.BookHub.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String titulo;
private String isbn;
private BigDecimal preco;
private LocalDate dataPublicacao;
private String categoria;
@ManyToOne
private Editora editora;
@ManyToMany
@JoinTable(name = "livro_autores")
private List<Autor> autores;
}