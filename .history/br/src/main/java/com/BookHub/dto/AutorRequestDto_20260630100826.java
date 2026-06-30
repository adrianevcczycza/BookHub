package com.BookHub.dto;

import java.math.BigDecimal;

public record AutorRequestDto(
    Long id,
    String titulo,
    String isbn,
    BigDecimal preco,
    LocalDate dataPublicacao,
    String categoria
) {
}