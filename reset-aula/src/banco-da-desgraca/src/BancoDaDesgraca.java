import domain.InstituicaoBancaria;
import domain.TipoTransacao;
import domain.Transacao;
import domain.conta.ContaBancaria;
import domain.conta.ContaCorrente;
import domain.conta.ContaDigital;
import domain.conta.ContaPoupanca;

import java.time.LocalDate;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaBancaria conta1 = new ContaDigital(123, InstituicaoBancaria.NUBANK, 100.00);
        ContaBancaria conta2 = new ContaCorrente(456, InstituicaoBancaria.BRADESCO, 50.00);
        ContaBancaria conta3 = new ContaDigital(789, InstituicaoBancaria.ITAU, 10.00);

        conta1.depositar(35.00);
        conta1.sacar(3.00);
        conta1.transferir(30.00, conta2);
        conta1.exibirExtrato(null, null);


        System.out.println(conta1.consultarSaldo());


    }
}
