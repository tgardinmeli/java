package com.dh.meli.projetoaula2.dto;

import com.dh.meli.projetoaula2.model.Author;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class AuthorDto {
    private String name;
    private AddressDto addressDto;

    public AuthorDto(Author author) {
        this.name = author.getName();
        this.addressDto = new AddressDto(author.getAddress());
    }
}
