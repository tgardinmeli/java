package com.dh.meli.projetoaula2.repository;

import com.dh.meli.projetoaula2.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
}
