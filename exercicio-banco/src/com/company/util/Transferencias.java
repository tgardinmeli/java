package com.company.util;

import com.company.interfaces.Transacoes;

public class Transferencias implements Transacoes {
    @Override
    public String transacaoOk() {
        return "Tranferência feita com sucesso, obrigado!";
    }

    @Override
    public String transacaoNaoOk() {
        return "Não foi possível realizar a tranferência, favor tentar novamente mais tarde!";
    }
}
