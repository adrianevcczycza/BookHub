package com.BookHub.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
    public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nacionalidade;

   @ManyToMany
        private Livro livro;

    List <Livro> livros;
    public Autor (
        String nome,
        String nacionalidade
    ){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

}
