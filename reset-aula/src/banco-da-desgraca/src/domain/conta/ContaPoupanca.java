package domain.conta;

import domain.Data;
import domain.InstituicaoBancaria;
import domain.TipoTransacao;
import domain.Transacao;
import exception.NotPermitedException;
import exception.SaldoInsuficienteException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ContaPoupanca extends ContaGenerica implements ContaBancaria {

    private int numeroConta;
    private InstituicaoBancaria instituicaoBancaria;
    private double saldo;

    public ContaPoupanca(int numeroConta, InstituicaoBancaria instituicaoBancaria, double saldo) {
        this.numeroConta = numeroConta;
        verificaInstituicao(instituicaoBancaria);
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldo = saldo;
    }

    private void verificaInstituicao(InstituicaoBancaria instituicaoBancaria) {
        if (instituicaoBancaria.equals(InstituicaoBancaria.NUBANK)) {
            throw new NotPermitedException("Essa Instituição não permite conta poupança!");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.instituicaoBancaria;
    }

    @Override
    public Double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
        this.addTransacao(new Transacao(TipoTransacao.ENTRADA, Data.getDataTransacao(), valor));
        System.out.println("Depositando valor " + DecimalFormat.getCurrencyInstance().format(valor) + " da " + this.toString());
    }

    @Override
    public void sacar(Double valor) {
        double valorComTaxa = valor * 1.02;
        if ((valorComTaxa <= this.saldo) && (valor >= 50.00)) {
            this.saldo -= valorComTaxa;
            this.addTransacao(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valor));
            System.out.println("Sacando valor " + DecimalFormat.getCurrencyInstance().format(valor) + " da " + this.toString());
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente e/ou valor inferior ao minimo !");
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        double valorComTaxaIgual = valor * 1.005;
        double valorComTaxaDiferente = valor * 1.01;

        if (this.instituicaoBancaria.equals(contaDestino.getInstituicaoBancaria()) && (valorComTaxaIgual <= this.saldo)) {
            this.saldo -= valorComTaxaIgual;
            this.addTransacao(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valorComTaxaIgual));

        } else if (valorComTaxaDiferente <= this.saldo) {
            this.saldo -= valorComTaxaDiferente;
            this.addTransacao(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valorComTaxaDiferente));
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
        contaDestino.depositar(valor);
        System.out.println("Transferindo valor " + DecimalFormat.getCurrencyInstance().format(valor) + " da " + this.toString() + " para " + contaDestino.toString());
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        List<Transacao> filtradas = new ArrayList<>();

        for (Transacao transacao : this.getTransacoes()) {
            if (inicio != null && fim != null) {
                if (transacao.getDataTransacao().isAfter(inicio.minusDays(1)) && transacao.getDataTransacao().isBefore(fim.plusDays(1))) {
                    filtradas.add(transacao);
                }
            } else if (inicio != null && fim == null) {
                if (transacao.getDataTransacao().isAfter(inicio.minusDays(1))) {
                    filtradas.add(transacao);
                }
            } else if (inicio == null && fim != null) {
                if (transacao.getDataTransacao().isBefore(fim.plusDays(1))) {
                    filtradas.add(transacao);
                }
            } else {
                filtradas.add(transacao);
            }
        }

        System.out.println("----- EXTRATO " + this.toString());
        for (Transacao transacao : filtradas) {
            if (transacao.getTipoTransacao().equals(TipoTransacao.ENTRADA)) {
                System.out.println("+ " + DecimalFormat.getCurrencyInstance().format(transacao.getValorTransacao()) + " " + transacao.getDataTransacao());
            } else {
                System.out.println("- " + DecimalFormat.getCurrencyInstance().format(transacao.getValorTransacao()) + " " + transacao.getDataTransacao());
            }
        }
        System.out.println("--------------------");
    }

    @Override
    public String toString() {
        return "Conta Poupança " + instituicaoBancaria.getDescricao() + " " + numeroConta;
    }

}
