package com.dh.meli.tutoriais.repository;

import com.dh.meli.tutoriais.model.Tutorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepo extends CrudRepository<Tutorial, Long> {

    List<Tutorial> findBySituacaoDaAplicacao(String situacao);
    List<Tutorial> findByTituloContaining(String titulo);

}
