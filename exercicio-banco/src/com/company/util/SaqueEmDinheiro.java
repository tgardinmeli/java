package com.company.util;

import com.company.interfaces.Transacoes;

public class SaqueEmDinheiro implements Transacoes {
    @Override
    public String transacaoOk() {
        return "Saque efetuado com sucesso!";
    }

    @Override
    public String transacaoNaoOk() {
        return "Não foi possível realizar o saque, por favor, tente novamente dentro de alguns minuutos!";
    }
}
