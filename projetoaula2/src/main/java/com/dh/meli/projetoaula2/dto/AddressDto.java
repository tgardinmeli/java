package com.dh.meli.projetoaula2.dto;

import com.dh.meli.projetoaula2.model.Address;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDto {
    private String location;

    public AddressDto(Address address) {
        this.location = address.getLocation();
    }
}
