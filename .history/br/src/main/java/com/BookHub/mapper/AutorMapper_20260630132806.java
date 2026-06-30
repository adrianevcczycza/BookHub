package com.BookHub.mapper;

import org.springframework.stereotype.Component;

import com.BookHub.dto.AutorRequestDto;
import com.BookHub.model.Autor;
import com.BookHub.model.Livro;

@Component
public class AutorMapper {
    public Autor toEntity(AutorRequestDto AutorRequestDto, Livro livro){
        return new Autor(
            A
        ); 
    }
    
}
