package com.dh.meli.projetoaula2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "endereco")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    @Column(name = "localizacao", nullable = false)
    @JsonProperty("endereço")
    private String location;

    @OneToOne
    @JoinColumn(name = "id_author") // indica que será a chave estrangeira
    private Author author;
}
