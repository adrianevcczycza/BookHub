package com.BookHub.dto;

public record EditoraRequestDto(
    Long id,
    String cnpj;,
    Long telefone;
    String email;
) {
}