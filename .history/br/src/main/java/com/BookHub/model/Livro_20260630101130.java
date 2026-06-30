package com.BookHub.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.web.servlet.tags.EditorAwareTag;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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
private EditorAwareTag editora;
@ManyToMany
@JoinTable(name = "livro_autores")
private List<Autor> autores;
}