package com.BookHub.model;

import jakarta.persistence.Entity;

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