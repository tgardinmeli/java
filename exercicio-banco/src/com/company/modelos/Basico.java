package com.company.modelos;

import com.company.interfaces.Transacoes;

public class Basico extends Conta{

    Transacoes saque, consultaSaldo, pagamentoDeServicos;

    public Basico(double Saldo, Transacoes saque, Transacoes consultaSaldo, Transacoes pagamentoDeServicos) {
        super(Saldo);
        this.saque = saque;
        this.consultaSaldo = consultaSaldo;
        this.pagamentoDeServicos = pagamentoDeServicos;
    }

    public String saque(double valor){
        if(this.getSaldo() >= valor ){
            return saque.transacaoOk();
        }
        return saque.transacaoNaoOk();
    }

    public String consultaSaldo(){
        return consultaSaldo.transacaoOk();
    }

    public String pagamentoDeServico(double valor){
        if(this.getSaldo()> valor ){
            return pagamentoDeServicos.transacaoOk();
        }
        return pagamentoDeServicos.transacaoNaoOk();
    }
}
