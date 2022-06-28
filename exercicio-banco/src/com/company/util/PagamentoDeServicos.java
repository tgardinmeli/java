package com.company.util;

import com.company.interfaces.Transacoes;

public class PagamentoDeServicos implements Transacoes {
    @Override
    public String transacaoOk() {
        return "Pagamento efetuado com sucesso!";
    }

    @Override
    public String transacaoNaoOk() {
        return "Não foi possível realizar o pagamento, tente novamente mais tarde!";
    }
}
