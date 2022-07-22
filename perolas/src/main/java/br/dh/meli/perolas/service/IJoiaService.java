package br.dh.meli.perolas.service;

import br.dh.meli.perolas.dto.DtoJoia;
import br.dh.meli.perolas.model.DtoMensagem;
import br.dh.meli.perolas.model.Joia;

import java.util.List;
import java.util.Map;

public interface IJoiaService {
    DtoJoia cadastrarJoia(Joia newJoia);
    Joia buscarJoia(long id);
    List<Joia> listarJoiasCadastradas();
    DtoMensagem deletarJoia(long id);
    Joia atualizarJoia(Joia joia);
    Joia atualizarJoiaParcial(long id, Map<String, ?> mudancas);
}
