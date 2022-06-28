package com.company.modelos;

import com.company.interfaces.Transacoes;

public class Cobrador extends Conta{
    Transacoes saque;
    Transacoes consultaSaldo ;


    public Cobrador(double Saldo, Transacoes saque, Transacoes consultaSaldo) {
        super(Saldo);
        this.saque = saque;
        this.consultaSaldo = consultaSaldo;
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
}
