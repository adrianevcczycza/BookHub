package com.BookHub.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record AutorRequestDto(
     Long id;
String titulo;
private String isbn;
private BigDecimal preco;
private LocalDate dataPublicacao;
private String categoria;
) {
}