import domain.InstituicaoBancaria;
import domain.TipoTransacao;
import domain.Transacao;
import domain.conta.ContaBancaria;
import domain.conta.ContaCorrente;
import domain.conta.ContaDigital;
import domain.conta.ContaPoupanca;

public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaBancaria conta1 = new ContaPoupanca(123, InstituicaoBancaria.ITAU, 100.00);
 //      ContaBancaria conta2 = new ContaCorrente(456, InstituicaoBancaria.BRADESCO , 50.00);
 //      ContaBancaria conta3 = new ContaDigital(789, InstituicaoBancaria.CAIXA, 10.00);

        System.out.println(conta1.consultarSaldo());
   //     conta1.depositar(50.00);
        conta1.sacar(50.0);
      //  conta1.exibirExtrato();
    }
}
