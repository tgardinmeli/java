package br.dh.meli.springdata01.service;

import br.dh.meli.springdata01.model.UserDhMeli;
import br.dh.meli.springdata01.repository.IUserDhMeliRepo;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDhMeliService implements IUserDhMeliService {
    @Autowired
    private IUserDhMeliRepo repo;

    @Override
    public Optional<UserDhMeli> getUserById(Long id){
        return repo.findById(id);
    }

    @Override
    public UserDhMeli createUser(UserDhMeli newUser){
        if(newUser.getId() > 0) return null;
        return repo.save(newUser);
    }

    @Override
    public UserDhMeli updateUser(UserDhMeli user) {
        Optional<UserDhMeli> userDhMeli = getUserById(user.getId());
        if(userDhMeli.isPresent()){
            return repo.save(user);
        }
        return null;

    }

    @Override
    public void deleteUserById(Long id){
        if(repo.findById(id).isPresent()){
            repo.deleteById(id);
        }
        // TODO: lançar exceção
    }

    @Override
    public List<UserDhMeli> getAll() {
        return (List<UserDhMeli>) repo.findAll();
    }


}
