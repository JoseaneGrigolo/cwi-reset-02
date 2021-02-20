package exercicioAula02;


import java.util.List;

public class Filme {
    private String nome;
    private String descricao;
    private int duracaoMinutos;
    private int anoLancamento;
    private int avaliacao;
    private Diretor diretor;

    private List<Pessoa> elenco;

    public Filme(String nome, String descricao, int duracaoMinutos, int anoLancamento, int avaliacao, Diretor diretor, List<Pessoa> elenco) {
        defineAvaliacao(avaliacao);
        validaNomeEDefineAvaliacao(nome);
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.elenco = elenco;

    }

    private void defineAvaliacao(int avaliacao) {
        if (avaliacao < 1 || avaliacao > 5) {
            this.avaliacao = 3;
        } else {
            this.avaliacao = avaliacao;
        }

    }

    private void validaNomeEDefineAvaliacao(String nome) {
        if ("Batman vs Superman".equals(nome)) {
            this.avaliacao = 1;
        } else if ("O Clube da Luta".equals(nome)) {
            this.avaliacao = 5;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public String reproduzir() {
        return "Filme" + "\n" +
                "Nome: " + nome + "\n" +
                "Descricao: " + descricao + "\n" +
                "Duracao em Minutos: " + duracaoMinutos + "\n" +
                "Diretor: " + diretor.getNome();

    }
    /*
    public String creditos() {
        String retorno = "";
        for(Pessoa pessoa: elenco) {
            retorno = retorno + pessoa.imprimir() + "\n";
        }
        return retorno;
    }
    */

    public void exibirCreditos() {
        System.out.println("Elenco: ");
        for(Pessoa pessoa: elenco) {
            System.out.println(pessoa.imprimir());
        }

    }

}
