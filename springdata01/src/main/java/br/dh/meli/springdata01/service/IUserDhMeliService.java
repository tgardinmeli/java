package br.dh.meli.springdata01.service;

import br.dh.meli.springdata01.model.UserDhMeli;


import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IUserDhMeliService {

    UserDhMeli getByEmail(String email);
    UserDhMeli getUserById(Long id);
    UserDhMeli createUser(UserDhMeli newUser);
    UserDhMeli updateUser(UserDhMeli user);
    UserDhMeli updateParcial(long id, Map<String, String> changes);
    void deleteUserById(Long id);
    List<UserDhMeli> getAll();

}
