package br.dh.meli.springdata01.service;

import br.dh.meli.springdata01.model.UserDhMeli;

import java.util.List;
import java.util.Optional;

public interface IUserDhMeliService {

    Optional<UserDhMeli> getUserById(Long id);
    UserDhMeli createUser(UserDhMeli newUser);
    UserDhMeli updateUser(UserDhMeli user);
    void deleteUserById(Long id);
    List<UserDhMeli> getAll();

}
