package com.BookHub.dto;

public record EditoraRequestDto(
    private Long id;
    private String cnpj;
    Long telefone;
    String email;
) {
}