package com.company;

import com.company.interfaces.Transacoes;
import com.company.modelos.Basico;
import com.company.modelos.Cobrador;
import com.company.modelos.Executivo;
import com.company.util.*;

public class AppBanco {
    public static void main(String[] args) {
        Transacoes saque = new SaqueEmDinheiro();
        Transacoes deposito = new Deposito();
        Transacoes pagamento = new PagamentoDeServicos();
        Transacoes transferencia = new Transferencias();
        Transacoes consultaSaldo = new ConsultaDeSaldo();

        Executivo ex = new Executivo(100,deposito, transferencia);
        Basico bs = new Basico(200, saque, consultaSaldo, pagamento);
        Cobrador cb= new Cobrador(300, saque, consultaSaldo);

        System.out.println(ex.deposito(200));
        System.out.println(ex.transferencia(50));

        System.out.println(bs.consultaSaldo());
        System.out.println(bs.pagamentoDeServico(100));
        System.out.println(bs.saque(10));

        System.out.println(cb.consultaSaldo());
        System.out.println(cb.saque(10));
    }
}
