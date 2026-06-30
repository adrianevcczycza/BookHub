package com.BookHub.dto;

public record EditoraRequestDto(
    private Long id;
    private String nome;
    String cnpj;
    Long telefone;
    String email;
) {
}