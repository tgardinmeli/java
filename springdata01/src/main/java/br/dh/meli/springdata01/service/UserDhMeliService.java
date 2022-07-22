package br.dh.meli.springdata01.service;

import br.dh.meli.springdata01.exception.BadRequestException;
import br.dh.meli.springdata01.exception.UserNotFoundException;
import br.dh.meli.springdata01.model.UserDhMeli;
import br.dh.meli.springdata01.repository.IUserDhMeliRepo;
import com.sun.xml.bind.v2.TODO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserDhMeliService implements IUserDhMeliService {
    @Autowired
    private IUserDhMeliRepo repo;

    @Override
    public UserDhMeli getByEmail(String email) {
        UserDhMeli user = repo.findByEmail(email);
        if(user != null){
            return user;
        }
        throw new UserNotFoundException("Usuário não encontrado");
    }

    @Override
    public UserDhMeli getUserById(Long id){
        return repo.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario não encontrado. id: " + id));
    }

    @Override
    public UserDhMeli createUser(UserDhMeli newUser){

        if(newUser.getId() > 0) throw new BadRequestException("O Usuário não pode ter id para ser cadastrado");
        return repo.save(newUser);
    }

    @Override
    public UserDhMeli updateUser(UserDhMeli user) {
            getUserById(user.getId());
            return repo.save(user);
    }

    @Override
    public UserDhMeli updateParcial(long id, Map<String, String> changes) {
        UserDhMeli userFound = getUserById(id);

        changes.forEach((chave, valor) -> {
            switch (chave){
                case "name":
                    userFound.setName(valor);
                    break;
                case "email":
                    userFound.setEmail(valor);
                    break;
            }
        });

        return repo.save(userFound);
    }

    @Override
    public void deleteUserById(Long id){
            UserDhMeli user = getUserById(id);
            repo.delete(user);
    }

    @Override
    public List<UserDhMeli> getAll() {
        return (List<UserDhMeli>) repo.findAll();
    }


}
