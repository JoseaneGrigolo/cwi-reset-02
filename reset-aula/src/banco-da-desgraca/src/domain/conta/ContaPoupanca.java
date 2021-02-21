package domain.conta;

import domain.Data;
import domain.InstituicaoBancaria;
import domain.TipoTransacao;
import domain.Transacao;
import exception.NotPermitedException;
import exception.SaldoInsuficienteException;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class ContaPoupanca  extends ContaGenerica implements ContaBancaria{

    private int numeroConta;
    private InstituicaoBancaria instituicaoBancaria;
    private double saldo;


    public ContaPoupanca(int numeroConta, InstituicaoBancaria instituicaoBancaria, double saldo) {
        this.numeroConta = numeroConta;
        verificaInstituicao(instituicaoBancaria);
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldo = saldo;
    }

    private void verificaInstituicao(InstituicaoBancaria instituicaoBancaria){
        if(instituicaoBancaria.equals(InstituicaoBancaria.NUBANK)){
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
        if ((valorComTaxa <= this.saldo) &&(valor >= 50.00)) {
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
            this.addTransacao(new Transacao(TipoTransacao.SAIDA, Data.getDataTransacao(), valor));
            contaDestino.depositar(valor);
            System.out.println("Transferindo valor " + DecimalFormat.getCurrencyInstance().format(valor) + " da " + this.toString()+ " para " + contaDestino.toString());
        } else if (valorComTaxaDiferente <= this.saldo) {
            this.saldo -= valorComTaxaDiferente;
            System.out.println("Transferindo valor " + DecimalFormat.getCurrencyInstance().format(valor) + " da " + this.toString() + " para " + contaDestino.toString());
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
       if(inicio == null && fim == null) {
            System.out.println("----- EXTRATO " + this.toString());
            for (Transacao transacao : this.getTransacoes()) {
                if (transacao.getTipoTransacao().equals(TipoTransacao.ENTRADA)) {
                    System.out.println("+ " + transacao.getValorTransacao() + " " + transacao.getDataTransacao());
                } else {
                    System.out.println("- " + transacao.getValorTransacao() + " " + transacao.getDataTransacao());
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
        return "Conta Poupança " + instituicaoBancaria.getDescricao() + " " + numeroConta;
    }

}
