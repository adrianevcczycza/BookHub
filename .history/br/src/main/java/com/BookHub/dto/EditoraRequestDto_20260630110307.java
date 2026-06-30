package com.BookHub.dto;

public record EditoraRequestDto(
    private Long id;
    private String nome;
    private String cnpj;
    private Long telefone;
    String email;
) {
}