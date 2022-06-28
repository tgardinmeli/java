package com.company.util;

import com.company.interfaces.Transacoes;

public class Deposito implements Transacoes {
    @Override
    public String transacaoOk() {
        return "Transação deu tudo certo!";
    }

    @Override
    public String transacaoNaoOk() {
        return "Transação falhou!";
    }
}
