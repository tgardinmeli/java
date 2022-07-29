package com.dh.meli.integradora_spring_elastic.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "meli_empoyee")
@Getter @Setter
public class Employee {
    @Id
    private String id;

    @Field(name = "nome", type = FieldType.Text)
    private String name;

    @Field(name = "idade", type = FieldType.Integer)
    private int age;

    @Field(name = "endereco", type = FieldType.Nested)
    Address address;

}
