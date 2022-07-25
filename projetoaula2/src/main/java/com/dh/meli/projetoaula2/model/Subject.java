package com.dh.meli.projetoaula2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titulo", length = 30)
    private String title;

    @OneToMany(mappedBy = "subject")
    @JsonIgnoreProperties("subject")
    private List<Book> bookList ;
}
