package com.BookHub.dto;

public record EditoraRequestDto(
    Long id;
    private String cnpj;
    Long telefone;
    String email;
) {
}