package com.company.modelos;

import com.company.interfaces.Transacoes;

public class Executivo extends Conta{

    Transacoes deposito, transferencia;

    public Executivo(double Saldo, Transacoes deposito, Transacoes transferencia) {
        super(Saldo);
        this.deposito = deposito;
        this.transferencia = transferencia;
    }

    public String deposito(double valor){
        if(valor > 0){
            return deposito.transacaoOk();
        }
        return deposito.transacaoNaoOk();
    }

    public String transferencia(double valor){
        if(this.getSaldo() >= valor){
            return transferencia.transacaoOk();
        }
        return transferencia.transacaoNaoOk();
    }

}
