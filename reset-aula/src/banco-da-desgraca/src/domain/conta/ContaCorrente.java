package domain.conta;

import domain.Data;
import domain.InstituicaoBancaria;
import domain.TipoTransacao;
import domain.Transacao;
import exception.SaldoInsuficienteException;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class ContaCorrente extends ContaGenerica implements ContaBancaria {

    private int numeroConta;
    private InstituicaoBancaria instituicaoBancaria;
    private double saldo;

    public ContaCorrente(int numeroConta, InstituicaoBancaria instituicaoBancaria, double saldo) {
        this.numeroConta = numeroConta;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldo = saldo;
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
        if (valor <= this.saldo) {
            if (valor % 5 == 0) {
                this.saldo -= valor;
                this.addTransacao(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valor));
                System.out.println("Sacando valor " + DecimalFormat.getCurrencyInstance().format(valor) + " da " + this.toString());
            }
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        double valorComTaxa = valor * 1.01;
        if (valorComTaxa <= this.saldo) {
            this.saldo -= valorComTaxa;
            this.addTransacao(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valorComTaxa));
            contaDestino.depositar(valor);
            System.out.println("Transferindo valor " + DecimalFormat.getCurrencyInstance().format(valor) + " da " + this.toString());
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
    }


    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {

        if (inicio == null && fim == null) {
            System.out.println("----- EXTRATO " + this.toString());
            for (Transacao transacao : this.getTransacoes()) {
                if (transacao.getTipoTransacao().equals(TipoTransacao.ENTRADA)) {
                    System.out.println("+ " + DecimalFormat.getCurrencyInstance().format(transacao.getValorTransacao()) + " " + transacao.getDataTransacao());
                } else {
                    System.out.println("- " + DecimalFormat.getCurrencyInstance().format(transacao.getValorTransacao()) + " " + transacao.getDataTransacao());
                }
            }
        }
        /**
         * Exibe o extrato da conta para o período informado.
         *   Se não for passada a data de início, deve filtrar somente pela data de fim.
         *   Se não for passada a data de fim, deve filtrar somente pela data de início.
        */
    }


    @Override
    public String toString() {
        return "Conta Corrente " + instituicaoBancaria.getDescricao() + " " + numeroConta;
    }

}