package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garagem {
    private long id;
    private List<Veiculo> listaGaragem = new ArrayList<Veiculo>();

    public List<Veiculo> getListaGaragem() {
        return listaGaragem;
    }

    public void setListaGaragem(List<Veiculo> listaGaragem) {
        this.listaGaragem = listaGaragem;
    }

    public long getId() {
        return id;
    }
}
