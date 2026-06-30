package com.BookHub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Autor {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nome;
private String nacionalidade;

}
