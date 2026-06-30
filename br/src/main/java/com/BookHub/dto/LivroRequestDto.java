package com.BookHub.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record LivroRequestDto(
    Long id,
    String titulo,
    String isbn,
    BigDecimal preco,
    LocalDate dataPublicacao,
    String categoria
) {
}
 