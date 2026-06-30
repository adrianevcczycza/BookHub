package com.BookHub.model;

import java.security.PrivateKey;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table ( name = "autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nacionalidade;
    private int dataNacimento;

   @ManyToMany
    private Livro livro;

    List <Livro> livros;
    public Autor (
        String nome,
        String nacionalidade
        int dataNacimento
    ){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNacimento = dataNacimento;
    }

}
