package com.BookHub.dto;




public record AutorRequestDto(
    Long id,
    String titulo,
    String isbn,
    BigDecimal preco,
    LocalDate dataPublicacao,
    String categoria
) {
}