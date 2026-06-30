package com.BookHub.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record LivroResponseDto(
    String titulo,
    String isbn,
    BigDecimal preco,
    LocalDate dataPublicacao,
    String categoria
) {
}
