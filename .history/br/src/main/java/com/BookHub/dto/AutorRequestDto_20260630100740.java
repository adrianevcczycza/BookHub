package com.BookHub.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record AutorRequestDto(
     Long id;
String titulo;
String isbn;
BigDecimal preco;
LocalDate dataPublicacao;
private String categoria;
) {
}