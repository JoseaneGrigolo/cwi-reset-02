package domain.conta;

import domain.Transacao;

import java.util.List;

public class ContaGenerica {

    private List<Transacao> transacoes;

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void addTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }

}
