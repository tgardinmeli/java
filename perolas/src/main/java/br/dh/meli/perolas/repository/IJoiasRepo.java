package br.dh.meli.perolas.repository;

import br.dh.meli.perolas.model.Joia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJoiasRepo extends CrudRepository<Joia, Long> {
}
