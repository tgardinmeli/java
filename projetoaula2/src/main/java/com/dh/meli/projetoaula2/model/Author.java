package com.dh.meli.projetoaula2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autor")
public class Author {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (nullable = false)
    private long id;

    @Column(name = "nome", nullable = false)
    private String name;

    @OneToOne(mappedBy = "author") //author = nome do campo na tabela address que é usada como referência
    @JsonIgnoreProperties("author")
    private Address address;

    @ManyToMany
    @JoinTable(name = "book_author",
               joinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id"),
                inverseJoinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"))
    @JsonIgnoreProperties("authors")
    private List<Book> books;
}
