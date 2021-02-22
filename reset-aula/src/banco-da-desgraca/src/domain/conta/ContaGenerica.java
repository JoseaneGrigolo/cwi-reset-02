package domain.conta;

import domain.Transacao;

import java.util.ArrayList;
import java.util.List;

public class ContaGenerica {

    private List<Transacao> transacoes = new ArrayList<>();

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void addTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }

}
