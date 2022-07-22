package br.dh.meli.perolas.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_joias")
public class Joia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "material", length = 100, nullable = false)
    private String material;

    @Column(name = "peso")
    private double peso;

    @Column(name = "quilates")
    private int quilates;
}
