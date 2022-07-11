package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {
    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Size(max = 30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    @Pattern(regexp="[A-Z][a-záàâãéèêíïóôõöúçñ]+", message = "O nome do assunto deve começar com letra maiúscula.")
    String name;

    @NotBlank(message = "A nota não pode estar vazia.")
    @DecimalMin(value = "0.0", message = "A nota mínima é 0,0.")
    @DecimalMax(value = "10.0", message = "A nota máxima é 10,0.")
    Double score;
}
