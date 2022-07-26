package com.dh.meli.spring_elastic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Document(indexName = "meli_doc")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    @Id
    private int id;

    @Field(name = "title", type = FieldType.Text)
    private String title;

    @Field(type = FieldType.Nested, includeInParent = true)
    private List<Author> authors;
}
