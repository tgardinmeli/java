package com.company.util;

import com.company.interfaces.Transacoes;

public class ConsultaDeSaldo implements Transacoes {
    @Override
    public String transacaoOk() {
        return "A consulta de saldo deu tudo certo!";
    }

    @Override
    public String transacaoNaoOk() {
        return "A consulta de saldo falhou!";
    }

}
