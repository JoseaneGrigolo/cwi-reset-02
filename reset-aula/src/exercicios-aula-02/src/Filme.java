public class Filme extends Diretor{

    private String nome;
    private String descricao;
    private int duracaoMinutos;
    private int anoLancamento;
    private int avaliacao;

    public Filme(String nome, String descricao, int duracaoMinutos, int anoLancamento, int avaliacao) {
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
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
                "Diretor: " + getNomeDiretor();
    }
}
