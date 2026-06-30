package com.BookHub.mapper;

import org.springframework.stereotype.Component;

import com.BookHub.dto.EditoraRequestDto;
import com.BookHub.model.Editora;

@Component
public class EditoraMapper {
    public Editora toEntity(EditoraRequestDto editoraRequestDto){
        return new Editora(
            editoraRequestDto.telefone(),
            editoraRequestDto.cnpj(),
            editoraRequestDto.email()
    }
    
}
