package br.dh.meli.springdata01.service;

import br.dh.meli.springdata01.model.UserDhMeli;
import br.dh.meli.springdata01.repository.IUserDhMeliRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDhMeliService {
    @Autowired
    private IUserDhMeliRepo repo;

    public UserDhMeli getUserById(Long id){
        return (UserDhMeli) repo.findById(id).orElse(null);
    }
}
