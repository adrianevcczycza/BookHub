package com.BookHub.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "editora")
@Getter
@Setter
public class Editora {

    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    
    private Long id;
    private 


}
