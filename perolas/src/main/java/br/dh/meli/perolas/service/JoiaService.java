package br.dh.meli.perolas.service;

import br.dh.meli.perolas.dto.DtoJoia;
import br.dh.meli.perolas.exception.CadastroJaExisteException;
import br.dh.meli.perolas.exception.JoiaNaoExisteException;
import br.dh.meli.perolas.model.DtoMensagem;
import br.dh.meli.perolas.model.Joia;
import br.dh.meli.perolas.repository.IJoiasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class JoiaService implements IJoiaService{

    @Autowired
    private IJoiasRepo repo;

    @Override
    public DtoJoia cadastrarJoia(Joia newJoia) {
        Optional<Joia> joias = repo.findById(newJoia.getId());
        if(joias.isPresent()){
            throw new CadastroJaExisteException("Essa joia já está cadastrada");
        }
        repo.save(newJoia);

        return DtoJoia.builder()
                .id(newJoia.getId())
                .build();
    }


    @Override
    public Joia buscarJoia(long id) {
        return repo.findById(id).orElseThrow(() -> new JoiaNaoExisteException("Essa joia não está cadastrada"));
    }

    @Override
    public List<Joia> listarJoiasCadastradas() {
        return (List)repo.findAll();
    }

    @Override
    public DtoMensagem deletarJoia(long id) {
        Joia joia = buscarJoia(id);
        repo.delete(joia);
        return DtoMensagem.builder()
                .mensagem("Joia excluida com sucesso!")
                .build();
    }

    @Override
    public Joia atualizarJoia(Joia joiaRecebida) {
        Joia joia = buscarJoia(joiaRecebida.getId());
        return repo.save(joiaRecebida);
    }

    @Override
    public Joia atualizarJoiaParcial(long id, Map<String, ?> mudancas) {
        Joia joia = buscarJoia(id);
        mudancas.forEach((atributo, valor) -> {
            switch (atributo){
                case "material":
                    joia.setMaterial((String) valor);
                    break;
                case "peso":
                    joia.setPeso((double) valor);
                    break;
                case "quilates":
                    joia.setQuilates((int) valor);
            }
        });
        return repo.save(joia);
    }


}
