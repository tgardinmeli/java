package br.dh.meli.springdata01.repository;

import br.dh.meli.springdata01.model.UserDhMeli;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDhMeliRepo extends CrudRepository<UserDhMeli, Long> {
}
