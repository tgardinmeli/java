package com.dh.meli.projetoaula2.repository;

import com.dh.meli.projetoaula2.dto.AuthorDto;
import com.dh.meli.projetoaula2.model.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends CrudRepository<Author, Long> {
    @Query("select a from Author a where a.id = ?1")
    AuthorDto getById(long id);

    @Query(value = "select * from autor where id = ?1 ", nativeQuery = true)
    Author getNativeById(long id);

    @Query("select a from Author a left join fetch a.address where a.id = :id")
    Author getEagleById(long id);
}
